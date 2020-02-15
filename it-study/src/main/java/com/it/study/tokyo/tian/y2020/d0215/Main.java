package com.it.study.tokyo.tian.y2020.d0215;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 標準入力から値を取得してinput_lineに入れる
        String inputLine = "500";
        int di = Integer.parseInt(inputLine);
        String text = "12 3 4 6";

//        "123456789abcdef"
        // linux
        String num = "1234";
        int intNum = Integer.parseInt(num);
//        System.out.println("int" + intNum);
        // 1
        String numStr = intNum + "";
        System.out.println("numstr " + numStr);
        // 2
        String numStr2 = String.valueOf(intNum);
//        System.out.println("numstr2 " + numStr2);
        // 3
        String numStr3 = Integer.toString(intNum);
//        System.out.println("numstr3 " + numStr3);

        char[] chars = text.toCharArray();
        List<Integer> ints = new ArrayList<>();
//        String text = "12 3 4 6";
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
//
//        for (char c : chars) {
//            if (c == ' ') {
//                continue;
//            }
//            int i = (int) c - (int) '0';
//            ints.add(i);
//        }
//        System.out.println(ints.toString());


//        System.out.println(text);
//        String[] heights = sc.nextLine().split(" ");
//
//
//
//        int smallHeight = 0;
//
//        for (int i = 0; i < heights.length; i++) {
//            int i1 = Integer.parseInt(heights[i]);
//            if (smallHeight == 0) {
//                smallHeight = i1;
//                continue;
//            }
//            if (smallHeight > i1) {
//                smallHeight = i1;
//            }
//        }
//
////        for(heights:length)
//        for (String str : heights){
//            int i1 = Integer.parseInt(str);
//            if (smallHeight == 0) {
//                smallHeight = i1;
//                continue;
//            }
//            if (smallHeight > i1) {
//                smallHeight = i1;
//            }
//        }
//
//
//
//        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
//        System.out.println(smallHeight * di);
    }
}