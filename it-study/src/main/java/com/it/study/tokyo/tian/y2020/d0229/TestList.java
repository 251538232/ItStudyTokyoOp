package com.it.study.tokyo.tian.y2020.d0229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    static String str = "1 2 3 4 5 6 7 8";

    public static void main(String[] args) {
        String[] s = str.split(" ");
        // array -> list
        List<String> strings = Arrays.asList(s);
        System.out.println(strings);
        // [1,2,3]
        // [4,5,6]
        // [7,8]

        // 把list 分割为多个list 每个分割后的list最大3个元素
        // list里面有多少个元素
        // 0-2 3-5 6-7
//        循环
//        int splitSize = 3;
//        int groupCount = strings.size() % splitSize == 0 ? strings.size() / splitSize : strings.size() / splitSize + 1;
//
//
//        for (int i = 0; i < strings.size(); i++) {
//            List<String> tmpList = new ArrayList<>();
//            tmpList.add(strings.get(i));
//            lists.add(tmpList);
//        }

//        splitList(strings, 3);
//        splitList1(strings, 3);
        splitList2(strings, 3);
    }


    private static void splitList2(List<String> strings, int s) {
        int size = strings.size();
        List<List<String>> lists = new ArrayList<>();
//        0,3
//        3,6
//        6,8
        for (int i = 0; i < size; i += s) {
            int k = i + s >= strings.size() ? strings.size() : i + s;
            lists.add(strings.subList(i, k));
        }// perl ruby:松本行弘 现在在楽天
        System.out.println(lists);
    }

    private static void splitList(List<String> strings, int s) {
        List<List<String>> lists = new ArrayList<>();
        List<String> tmpList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            tmpList.add(strings.get(i));
            if (tmpList.size() == s || i == strings.size() - 1) {
                lists.add(tmpList);
                tmpList = new ArrayList<>();
            }
        }
        System.out.println(lists);
    }

    private static void splitList1(List<String> strings, int s) {
        // 0-2 3-5 6-7 9
        List<List<String>> lists = new ArrayList<>();
        // 8 s=9
        for (int i = 0; i < strings.size(); i += s) {
            List<String> tmpList = new ArrayList<>();
            int k = i + s >= strings.size() ? strings.size() : i + s;
            for (int j = i; j < k; j++) {
                tmpList.add(strings.get(j));
            }
            lists.add(tmpList);
        }
        System.out.println(lists);
    }
}
