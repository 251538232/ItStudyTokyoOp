package com.it.study.tokyo.tian.y2020.d0215;

import java.util.ArrayList;
import java.util.List;

public class Wang {
    public static void main(String[] args) {
        String text = "123,45.6,7,8,90.16,17,18,190.";
        List<Integer> strings = new ArrayList<>();
        String[] sp = text.split(",");
        for (String s : sp) {
            String[] split = s.split("\\.");
            for (String s1 : split) {
                strings.add(Integer.parseInt(s1));
            }
        }
        System.out.println(strings);
        String.valueOf(true);
//        char[] chars = text.toCharArray();
//        List<Integer> ints = new ArrayList<>();
//
//        String tmp = "";
//        for (char c : chars) {
//            if (c != ',') {
//                tmp = tmp + c;
//            }
//            if (c == ',') {
//                ints.add(Integer.parseInt(tmp));
//                tmp = "";
//            }
//        }
//        if (!"".equals(tmp)) {
//            ints.add(Integer.parseInt(tmp));
//        }
//
//        System.out.println(ints.toString());
    }

}
