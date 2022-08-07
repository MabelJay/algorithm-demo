package com.demos.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {

        User user1 = new User(1);
        User user2 = new User(1);

        Map<User, String> map = new HashMap<>();
        map.put(user1, "100");

        if (map.containsKey(user1)) {
            System.out.println(map.get(user1));
        }
        if (map.containsKey(user2)) {
            System.out.println(map.get(user2));
        }

        System.out.println("Current map size is: " + map.size());


        Iterator<User> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            User key = iterator.next();
            System.out.println("key=" + key + " value=" + map.get(key));
        }
    }
}
