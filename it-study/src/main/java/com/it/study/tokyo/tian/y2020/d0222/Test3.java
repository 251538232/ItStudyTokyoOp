package com.it.study.tokyo.tian.y2020.d0222;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<Integer>() {{
            add(3);
            add(3);
            add(3);
            add(3);
            add(5);
            add(7);
            add(2);
            add(16);
            add(16);
            add(12);
            add(11);
            add(2);
        }};
        // 去重复并排序 【优雅】
        List<Integer> distinctList = lists.stream().distinct().sorted((o1, o2) -> {
            return o1.compareTo(o2);
        }).collect(Collectors.toList());
        System.out.println(distinctList);
        System.out.println(distinctList.get(4));
//
//        List<Integer> distinctList1 = lists.stream().distinct().sorted((o1, o2) -> {
//            return o2.compareTo(o1);
//        }).collect(Collectors.toList());
//
//        System.out.println(distinctList.get(1));
//        System.out.println(distinctList.get(2));
//        System.out.println(distinctList);
//        System.out.println(distinctList1);
////
////        // 去重复
//        Set<Integer> intSet = new HashSet<>();
//        intSet.addAll(lists);
//        System.out.println(intSet);
//
//        TreeSet<Integer> integers = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        integers.addAll(lists);
//        System.out.println(integers);

        // 有没有样本模板（APK既有式样书）

    }

}
