package com.it.study.tokyo.tian.y2020.d0118;

import java.util.Stack;

/**
 * 实现回退
 */
public class TestHistoryBack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        // 第1步操作：123
        // 第2步操作：abc
        // 第3步操作：456
        // 压栈 进胡同
        stack.push("123");
        stack.push("abc");
        stack.push("456");
        System.out.println(stack.toArray().toString());

        // 1
        // 弹出栈 出胡同
        stack.pop();
        System.out.println(stack);
        // 2
//        List
        stack.pop();
        System.out.println(stack);
    }
}
