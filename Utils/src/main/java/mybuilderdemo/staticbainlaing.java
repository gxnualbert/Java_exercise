package mybuilderdemo;

/**
 * @auther gxnualbert
 * @create 2019-09-20-14:21
 */
public class staticbainlaing {

    public static void main(String[] args) {

        staticbainlaing a= new staticbainlaing();
        a.VarTest();
        staticbainlaing b= new staticbainlaing();
        b.VarTest();
        staticbainlaing c= new staticbainlaing();
        c.VarTest();
        staticbainlaing d= new staticbainlaing();
        d.VarTest();

    }
        public static int staticVar = 0;
        public int instanceVar = 0;
        public void VarTest ()
        {
            staticVar++;
            instanceVar++;
            System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
        }

}
