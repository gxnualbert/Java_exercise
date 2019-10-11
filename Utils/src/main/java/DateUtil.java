import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

/**
 * @auther gxnualbert
 * @create 2019-09-06-14:16
 */
public class DateUtil {

    /**
     * 获取两个时间之间的天数
     * @param beginDate  开始时间
     * @param endDate  截止时间
     * @param addDate  注册时间
     * @return
     */
    public static Integer getTimeSpan(Date beginDate, Date endDate, Date addDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        if(null == beginDate || null == endDate || null == addDate) {
            return 0;
        }
        try{
            beginDate  = dateFormat.parse(dateFormat.format(beginDate));
            endDate= dateFormat.parse(dateFormat.format(endDate));
            addDate= dateFormat.parse(dateFormat.format(addDate));
        }catch (Exception e){
            return 0;
        }
        //注册时间大于截止时间
        if (addDate.getTime()-endDate.getTime()>0){
            return 0;
        }
        //注册时间超过小于起始时间
        if (addDate.getTime()-beginDate.getTime()<0){
            Long count =  (endDate.getTime()-beginDate.getTime())/(24*60*60*1000);
            return count.intValue();
        }
        //注册时间等于截止时间
        if (addDate.getTime()-endDate.getTime()<=0 && addDate.getTime()-beginDate.getTime()>0){
            Long count = (endDate.getTime()-addDate.getTime())/(24*60*60*1000);
            return count.intValue();
        }
        //注册时间超过小于起始时间
        if (addDate.getTime()-endDate.getTime()==0 && addDate.getTime()-beginDate.getTime()==0){
            return 1;
        }
        return 0;
    }

    /**
     * 将形如"yyyy-MM-dd HH:mm:ss"的字符串转换为timestamp类型
     * @param dateStr  字符串（格式"yyyy-MM-dd HH:mm:ss"）
     * @return
     * @throws Exception
     */
    public static Timestamp validYmdhmsFormat(String dateStr) throws Exception {

        if (StringUtils.isEmpty(dateStr)) {
            throw new Exception("日期为空");
        }
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(dateStr);
            //如果未抛出异常，则将传入的字符串日期转为timestamp格式
            return Timestamp.valueOf(dateStr);
        } catch (ParseException e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            throw new Exception("日期不符合yyyy-MM-dd HH:mm:ss格式");
        }
    }

    public static String timestampToString (Timestamp ts) {
        String tsStr = "";
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            tsStr = sdf.format(ts);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tsStr;
    }


    public static String dateToString (Date date) {
        String dateStr = "";
        //format的格式可以任意
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            dateStr = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    public static Date stringToDate(String dateStr){
        Date date = new Date();
        //注意format的格式要与日期String的格式相匹配
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("将date转换成String："+dateToString(new Date()));
        System.out.println("将时间戳转换成String： "+timestampToString(new Timestamp(1486395030000L)));
        System.out.println("将日期转换成Date："+stringToDate("2018-09-07 21:00:00"));
        Date beginDate = stringToDate("2018-09-07 21:00:00");
        Date adddDate = stringToDate("2019-05-07 21:00:00");
        Date  endDate= stringToDate("2019-09-07 21:00:00");

        System.out.println(getTimeSpan(beginDate,endDate,adddDate));
        System.out.println(validYmdhmsFormat("2018-09-07 21:00:00"));
        System.out.println(validYmdhmsFormat("2018-09-07 21:00:00").getClass());

        System.out.println("这是用joda的时间的api："+DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
    }

}
