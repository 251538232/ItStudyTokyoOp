package com.it.study.tokyo.tian.y2020.d0118;

public class Test0118 {
    public static void main(String[] args) {
        // 9 9 乘法口诀
        /**
         * 1*1=1
         * 1*2=2 2*2=4
         * 1*3=3 2*3=6 3*3=9
         */
        int count = 9;
        // i left j right = xxx
        for (int i = 1; i <=count ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) +"\t");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------");
        // i left j right = xxx
        for (int i = 9; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) +"\t");
            }
            System.out.println("");
        }

        String a= "123";
        String b ="abc";
        // 123abc
        System.out.println(a + b);
    }
}
