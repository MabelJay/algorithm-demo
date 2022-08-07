package com.demos.overloadDemos;

import java.util.HashMap;
import java.util.Map;

public class GenericsDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "hi");
        map.put("how are you", "sayhi");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you"));
    }
}
