package com.demos.test;

import com.demos.algorithm.HuffmanTree2;

import java.math.BigDecimal;
import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);
        // “Peter”、“Tom”、“Mike”和“Tim”
        list.add("Peter");
        list.add("Tom");
        list.add("Mike");
        list.add("Tim");
        //Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //个名为sortedStudentList的LinkedList类型的对象，在其中，按名字首字母升序，重新存储上述四个学生的姓名
        List<String> sortedStudentList = new LinkedList<>();
        Comparator<String> comparator = (o1, o2) -> (o1.charAt(0) - o2.charAt(0));
        sortedStudentList.add("Peter");
        sortedStudentList.add("Tom");
        sortedStudentList.add("Mike");
        sortedStudentList.add("Tim");

        Collections.sort(sortedStudentList, comparator);
        Iterator<String> iterator1 = sortedStudentList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
