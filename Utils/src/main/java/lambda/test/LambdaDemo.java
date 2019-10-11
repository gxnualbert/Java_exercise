package lambda.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @auther gxnualbert
 * @create 2019-09-25-9:40
 * https://blog.csdn.net/zxhoo/article/details/38349011?utm_source=tuicool&utm_medium=referral
 * Java8学习笔记（1） -- 从函数式接口说起
 */
public class LambdaDemo {


    public static void main(String[] args) {
        // 使用lambda之前
        List<String> words = Arrays.asList("apple", "banana", "pear");

        System.out.println(words);
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                return Integer.compare(w1.length(), w2.length());
            }
        });
        System.out.println(words);

        // 使用lambda 之后
        words.stream().sorted(Comparator.comparingInt(String::length));
        System.out.println(words);

        
    }
}
