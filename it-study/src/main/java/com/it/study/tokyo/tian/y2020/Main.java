package com.it.study.tokyo.tian.y2020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        String inputLine = sc.nextLine();
        int di = Integer.parseInt(inputLine);
        String[] heights = sc.nextLine().split(" ");
        int smallHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            int i1 = Integer.parseInt(heights[i]);
            if (smallHeight == 0) {
                smallHeight = i1;
                continue;
            }
            if (smallHeight > i1) {
                smallHeight = i1;
            }
        }
        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
        System.out.println(smallHeight * di);
    }



}
