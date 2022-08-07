package com.demos.overloadDemos;

import java.util.ArrayList;
import java.util.List;

public class OverloadDemo1 {

    public static int method(List<Integer> list) {
        System.out.println("hi");
        return 1;
    }

    public static void main(String[] args) {
        method(new ArrayList<Integer>());
    }
}
