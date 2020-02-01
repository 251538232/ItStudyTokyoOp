package com.it.study.tokyo.tian.y2020.d0201;

public class TestSingleTon {

    /**
     * 单例模式测试
     * @param args
     */
    public static void main(String[] args) {
        //
        Single single = Single.getInstance();
        single.setName("123");
    }
}
