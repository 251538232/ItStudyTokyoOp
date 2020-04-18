package com.it.study.tokyo.tian.y2020.d0411;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;

public class TestStr {

    private List<Integer> getCharIndex(String str, char c){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new TestStr().getCharIndex(" abc我是工程师我是程序员123", '我'));
        String s = " AAA我是工程师,我是程序员CC";
        System.out.println(s.toLowerCase());
        String[] split = s.split(",");
        String trim = s.trim();
        String trim1 = s.trim();

    }
}
