package com.demos.extendsDemo.initialize;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
//        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("123", "11");
        map1.put("56", "78");
        map1.put("78", null);
        System.out.println(map1);
        map1.compute("78",(k, v)-> "13");
        System.out.println(map1);
    }
}
