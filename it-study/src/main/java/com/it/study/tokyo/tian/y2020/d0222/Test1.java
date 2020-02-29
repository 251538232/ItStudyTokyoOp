package com.it.study.tokyo.tian.y2020.d0222;

public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c1 = a;
        int c2 = b;
        a=c2;
        b=c1;

        a=b;
        b=c1;


        int i = a;
        a = b;
        b = i;

        // -128 --- 127
        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d);

        Integer e = 128;
        Integer f = 128;
        System.out.println(e.equals(f));
//        c = {Integer@540} 127
//        d = {Integer@540} 127
//        e = {Integer@541} 128
//        f = {Integer@542} 128

    }
}
