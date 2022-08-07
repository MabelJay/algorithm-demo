package com.demos.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        Emp emp1 = new Emp(100);
        Emp emp2 = new Emp(105);
        Emp emp3 = new Emp(100);
        Emp emp4 = new Emp(200);


        Set<Emp> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);

        System.out.println(set.size());

        Iterator<Emp> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getId());
        }
    }
}
