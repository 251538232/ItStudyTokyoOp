package com.it.study.tokyo.tian.y2020.d0201;

/**
 * 单例模式类
 */
public class Single {

    private static Single test = new Single();
    private String name;

    private Single() {
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Single getInstance() {
        return test;
    }
}
