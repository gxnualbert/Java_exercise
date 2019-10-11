import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther gxnualbert
 * @create 2019-09-23-14:09
 */
public class lambdaUsing {
    // 参考：https://blog.csdn.net/wangjie919/article/details/80451466
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java","scala","python");
        //before java8

        System.out.println("Java8 之前遍历字符串数组：");
        for(String each:languages) {
            System.out.println(each);
        }
        //after java8
        System.out.println("java 8 之后遍历字符串数组");
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);


        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        cost.stream().map(x -> x + x*0.05).forEach(x -> System.out.println(x));


        // 既然提到了map，又怎能不提到reduce。reduce与map一样，也是函数式编程里最重要的几个方法之一
        // map的作用是将一个对象变为另外一个，而reduce实现的则是将所有值合并为一个，
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);


        cost = Arrays.asList(10.0, 20.0,30.0,40.0);
        System.out.println("使用filter过滤之前，数组为：");
        System.out.println(cost.toString());
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        System.out.println("使用filter过滤之后的值如下：");
        filteredCost.forEach(x -> System.out.println(x));

















    }




}
