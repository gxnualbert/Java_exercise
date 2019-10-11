package HashMapSourceCodeRead;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.HashMap;

/**
 * HashMap源码阅读笔记
 * @auther gxnualbert
 * @create 2019-10-08-15:57
 */


public class HashMapSourceCodeRead1 {
    /**
     * 在看视频时，发现了hashmap中源码定义一个变量时，方式为：
     * static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
     * value是1 << 4
     * **/

    HashMap map;

    public static void main(String[] args) {
        System.out.println(1 << 4);
    }
}
