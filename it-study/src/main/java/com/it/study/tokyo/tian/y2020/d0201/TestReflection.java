package com.it.study.tokyo.tian.y2020.d0201;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

    // 开发：式样书 -> code

    // 反射
    public static void main(String[] args) throws Exception {
        Single single = Single.getInstance();
        single.setName("wenqiang");

        // 反射
        Method getNameMethod = single.getClass().getDeclaredMethod("getName");
        getNameMethod.setAccessible(true);
        System.out.println(getNameMethod.invoke(Single.getInstance()));

        for (Field declaredField : single.getClass().getDeclaredFields()) {
            System.out.println(declaredField.getType() + " " + declaredField.getName());
        }
        System.out.println("----------");
        for (Method m : single.getClass().getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }
}
