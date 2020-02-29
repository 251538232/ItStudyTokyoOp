package com.it.study.tokyo.tian.y2020.d0229;

public class TestThread {
    static int i = 90;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                System.out.println(i++);
            }
        });
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                System.out.println(i++);
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println(i++);
        });

        t1.start();
        t.start();
        t2.start();

    }
}
