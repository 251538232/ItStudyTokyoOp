package com.it.study.tokyo.tian.y2020.d0201;

import java.util.ArrayList;
import java.util.List;

public class TestFor {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("------------------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("------------------");

        strings.forEach(System.out::println);
        // 1.8
        strings.forEach(string -> System.out.println(string));

    }
}
