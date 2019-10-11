import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.springframework.web.multipart.MultipartFile;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;

/**
 * @auther gxnualbert
 * @create 2019-09-06-14:50
 */
public class CityUtil {

    static class ANode {
        String name;
        String code;
        public ANode(String name,String code){
            this.name=name;
            this.code=code;
        }
        Map<String,ANode> childs = new HashMap<>();
        public void addChild(ANode node){
            this.childs.put(node.name,node);
            this.childs.put(node.code,node);
        }

        public Map<String,ANode> getChilds(){
            return this.childs;
        }
    }


    Map<String,ANode> nodes = new HashMap<>();

    public Map<String,ANode> getNodes(){
        return this.nodes;
    }

    public CityUtil(){
        InputStream in = CityUtil.class.getClassLoader().getResourceAsStream("city2.js");

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(in,"utf-8"));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            Compilable compilable = (Compilable) engine;
            CompiledScript cScript = cScript = compilable.compile(sb.toString());
            ScriptObjectMirror obj =  (ScriptObjectMirror)cScript.eval();


            //  解析省
            Collection<Object> col = obj.values();
            for(Object aobj : col){
                ScriptObjectMirror obj1 = (ScriptObjectMirror)aobj;
                String key = obj1.get("0").toString();
                String name = obj1.get("1").toString();
                ANode ap = new ANode(name,key);
                nodes.put(name,ap);
                nodes.put(key,ap);
                ScriptObjectMirror obj2 = (ScriptObjectMirror)obj1.get("2");
                ana(obj2,ap);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void ana(ScriptObjectMirror amirror,ANode anode){

        Collection<Object> col3 = amirror.values();

        for(Object aobj3 : col3){

            if (aobj3 instanceof ScriptObjectMirror ){


                ScriptObjectMirror obj13 = (ScriptObjectMirror)aobj3;

                String key3 = obj13.get("0").toString();
                String name3 = obj13.get("1").toString();
                ANode aregion = new ANode(name3,key3);
                anode.addChild(aregion);

                ScriptObjectMirror obj4 = (ScriptObjectMirror)obj13.get("2");
                if(obj4 != null){
                    ana(obj4,aregion);
                }
            }

        }
    }



    public String getCode(String province,String city,String region) throws Exception {
        String rslt = "";
        ANode p = this.nodes.get(province);
        if(p == null){
            throw new Exception("省份错误");
        }
        ANode c = p.getChilds().get(city);
        if(c == null){
            throw new Exception("市错误");
        }

        ANode r = c.getChilds().get(region);
        if(c == null){
            throw new Exception("区错误");
        }
        rslt = r.code;

        if(rslt == null){
            throw new Exception("省市区错误");
        }
        return rslt;
    }


    public void writeFile(HttpServletResponse response, StringBuilder rslt,int etype) {

        try{
            String suf = "";
            if(etype==0){
                suf = "房源导出-";
            }else if(etype==1){
                suf = "房间导出-";
            }

            String fileName = suf+ DateUtil.dateToString(new Date())+".csv";
            // 设置强制下载不打开
            response.setContentType("application/force-download");
            response.setCharacterEncoding("UTF-8");

            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName,"utf-8"));
            // 写
            OutputStream os = response.getOutputStream();

            os.write(rslt.toString().getBytes("gbk"));
            os.flush();
            os.close();
        }catch(Exception e){
        }
    }

    public List<String> getFile(MultipartFile file) throws Exception {
        // 读取csv文件
        BufferedReader br = null;

        List<String> list = new ArrayList<>();
        try {
            String line = null;
            br = new BufferedReader(new InputStreamReader(file.getInputStream(),"gbk")) ;
            while((line=br.readLine())!= null){
                list.add(line);
            }
        } catch (IOException e) {
            throw new Exception("读取模板文件失败");
        }finally {
            if(br !=  null){
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return list;
    }

    public String getName(String code) throws Exception {
        String rslt = "";
        ANode p = this.nodes.get(code.substring(0,2));
        if(p == null){
            throw new Exception("省份错误,code:"+code);
        }
        ANode c = p.getChilds().get(code.substring(0,4));
        if(c == null){
            throw new Exception("市错误,code:"+code);
        }

        ANode r = c.getChilds().get(code.substring(0,6));
        if(r == null){
            throw new Exception("区错误,code:"+code);
        }
        rslt = p.name+","+c.name+","+r.name;

        if(rslt.length() < 3){
            throw new Exception("省市区错误,code:"+code);
        }
        return rslt;
    }
    public static void main(String[] a){
        CityUtil cutil = new CityUtil();

        ANode aNode = cutil.getNodes().get("北京").getChilds().get("北京市").getChilds().get("东城区");
        System.out.println(aNode.code);

//        try {
////            String code = cutil.getCode("北京","北京市","东城区");
////            System.out.println(code);
//
//            String name = cutil.getName("440306201805251011121".substring(0,6)).replace(",","");
//            System.out.println(name);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


}
