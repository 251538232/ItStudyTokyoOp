package com.it.study.tokyo.tian.y2020.d0215;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zhang {

    public static void main(String[] args) {
        String text = "123,45,6,7";


                char[] chars = text.toCharArray();
                List<Integer> ints = new ArrayList<>();

                String tmp = "";
                for (char c : chars) {
                    if (c != ',') {
                        tmp = tmp + c;
                    }
                    if (c == ',') {
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
