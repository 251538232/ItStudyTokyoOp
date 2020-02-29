package com.it.study.tokyo.tian.y2020.d0222;

public class Test {

    /**
     * 求最大最小值
     */
    public static void main(String[] args) {
        int[] ints = new int[]{3, 5, 7, 2};

        int min = ints[0];
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
            if (max < ints[i]) {
                max = ints[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
