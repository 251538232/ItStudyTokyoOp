package com.it.study.tokyo.tian.y2020.d0222;

public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;

        int tmp = a;
        a = b;
        b = tmp;


        // -128 --- 127
        Integer c = 127;
        Integer d = 127;
        // 对象相等 值相当 true
        System.out.println(c == d);

        // 值相当 true
        System.out.println(c.equals(d));

        int e1 = 128;
        int f1 = 128;
        System.out.println("e1 == f1 " + (e1 == f1));

//        -128 and 127
        Integer e = 128;
        Integer f = 128;
        // true int -2^31~~2^31-1
        System.out.println(e == f);
        // true
        System.out.println(e.equals(f));

    }
}
