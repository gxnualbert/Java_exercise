package mybuilderdemo;

/**
 * @auther gxnualbert
 * @create 2019-09-06-21:43
 */
public class MyMain {
    public static void main(String[] args) {
        Person person=new Person(1,"sds",3,"boy","13777867890","sdfsdfsd","sdfasdfa");
        System.out.println(person);
        Person pa=Person.builder().address("通过builder 赋值的地址").build();
        System.out.println(pa);
    }
}
