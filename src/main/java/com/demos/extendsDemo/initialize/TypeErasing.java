package com.demos.extendsDemo.initialize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeErasing {
    public static void main(String[] args) {
       /* List list = new ArrayList();
        list.add(1);
        list.add("2");
        System.out.println(list);*/

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);

        List<Integer> list3 = new ArrayList<>(list2);
        System.out.println(list3);
    }
}
