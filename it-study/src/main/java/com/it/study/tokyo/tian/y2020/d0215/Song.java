package com.it.study.tokyo.tian.y2020.d0215;

import java.util.ArrayList;
import java.util.List;

public class Song {

    public static void main(String[] args) {
        String text = "123,45,6,7";

        char[] chars = text.toCharArray();
        List<Integer> ints = new ArrayList<>();

//        // 2
//        String numStr2 = String.valueOf(intNum);
//        System.out.println("numstr2 " + numStr2);
//        // 3
//        String numStr3 = Integer.toString(intNum);
//        System.out.println("numstr3 " + numStr3);

        String tmp = "";
        for (char c : chars) {
            if (c != ' ') {
                tmp = tmp + c;
            }
            if (c == ' ') {
                ints.add(Integer.parseInt(tmp));
                tmp = "";
            }
        }
        if (!"".equals(tmp)) {
            ints.add(Integer.parseInt(tmp));
        }

        System.out.println(ints.toString());


    }
}
