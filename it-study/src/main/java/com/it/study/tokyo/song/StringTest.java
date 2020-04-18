package com.it.study.tokyo.song;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StringTest {
    private List<Integer> getCharIndex(String str, char c, char ch) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c || str.charAt(i) == ch) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(new StringTest().getCharIndex("123我是程序猿abc", '我', '是' ));
    }
}


