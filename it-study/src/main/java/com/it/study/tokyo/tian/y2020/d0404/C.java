package com.it.study.tokyo.tian.y2020.d0404;

import io.swagger.models.auth.In;

import java.util.List;

public class C {
    public static void main(String[] args) {
        int a = 1;
        float b = 2;
        System.out.println(a / b);
        System.out.println(getFromStr("abc我是工程师我是程序员123", "我"));
    }
    // 字符串 "abc我是工程师我是程序员123"
    // 输出 "我" 的index 不要用indexOf("")
    // 提示返回值 应该有多个 可以使用？？？int数组 List<Integer>
    private static List<Integer> getFromStr(String str, String x){
        System.out.println(str.toCharArray());
        for (int i = 0; i < str.toCharArray().length; i++) {
            System.out.println(str.toCharArray()[i]);
        }
        return null;
    }
}
