package IntegerDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther gxnualbert
 * @create 2019-09-29-15:25
 * 参考：https://blog.csdn.net/HappyHeng/article/details/52832313
 * https://blog.csdn.net/HappyHeng/article/details/52832313
 */
public class StreamOperation1 {
    static String sentence = "I don't know.";
    public static void main(String[] args)
    {
        // 1.遍历之后，将字母转换成大写
        System.out.println("将字母转换成大写字母");
        List<String> wordList = new ArrayList<>();
        wordList.add("a");
        wordList.add("f");
        wordList.add("c");
        wordList.add("g");
        wordList.add("o");
        wordList.add("w");
        wordList.add("h");
        List<String> output = wordList.stream().
                map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(output);

        // 过滤空字符串
        System.out.println("过滤空字符串：");
        List<String> output2 = wordList.stream().
                filter(a->!a.isEmpty()).
                collect(Collectors.toList());
        System.out.println(output2);


        // 循环操作循环操作(forEach)
        System.out.println("循环操作：");
        wordList.stream().forEach(System.out::println);

        //limit取前面n个元素；与skip跳过前面n个元素
        System.out.print("原列表为:");
        System.out.println(wordList);
        System.out.println("跳过前面2个，再取前三个之后的值为：");
        wordList.stream().skip(2).limit(3).forEach(System.out::print);
        System.out.println();

        // 对集合进行排序
        System.out.println("排序前");
        System.out.println(wordList);
        System.out.println("排序后");
        System.out.println(wordList.stream().sorted().collect(Collectors.toList()));








        // 2. 求一个数的平方
        System.out.println("求一个数的平方根：");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);





    }
}
