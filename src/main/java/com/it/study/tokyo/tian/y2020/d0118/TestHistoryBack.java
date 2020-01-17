package com.it.study.tokyo.tian.y2020.d0118;

import java.util.Stack;

/**
 * 实现回退
 */
public class TestHistoryBack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("1");
        System.out.println(stack.toArray().toString());
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");

    }
}
