package com.it.study.tokyo.tian.y2020.d0201;

import java.util.ArrayList;
import java.util.List;

public class TestForTest {

    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10000; i++) {
//            if (i == 1000) {
//                throw new Exception();
////                try
//            }
//        }
//        System.out.println("1111111");
//        for (int i = 0; i < 10000; i++) {
//            if (i == 10) {
//                return;
//            }
//        }
//        System.out.println("1111111");
        // init
//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < 10000000; i++) {
//            strings.add(Integer.toString(i));
//            if (i == 1) {
//                break;
//            }
//        }
//        System.out.println(strings);

        // 监听 listener
//        boolean result = true;
        int result = 10;
        int count = 1;
        // while (真 true)
        //
        while (result == 10) {
            System.out.println("1");
            count++;
            if (count == 4) {
                result = 11;
                // 1. break
                // 2. return 直接结束函数
                // 3. exception
                // 4. 更改使其不满足循环条件
            }

            try {
                Thread.sleep(20);
            } catch (Exception e) {
            }
        }
//
//        do {
//
//        } while (result == 10);
//
//        // 1 for i 性能更好
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < strings.size(); i++) {
//            strings.get(i).concat("1");
//        }
//        long end = System.currentTimeMillis();
//        // 1792
//        System.out.println(end - start);
//
//        // 2 代码更简洁
//        System.out.println("------------------");
//        long start1 = System.currentTimeMillis();
//        for (String string : strings) {
//            string.concat("1");
//        }
//        long end1 = System.currentTimeMillis();
//        // 3846
//        System.out.println(end1 - start1);

    }

    public static void test() {

    }
}
