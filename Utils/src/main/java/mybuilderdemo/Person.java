package mybuilderdemo;

import lombok.*;

/**
 * @auther gxnualbert
 * @create 2019-09-06-21:41
 */
@Data
@Builder
public class Person {
    //必要参数
    private final int id;
    private final String name;
    //可选参数
    private final int age;
    private final String sex;
    private final String phone;
    private final String address;
    private final String desc;
}
