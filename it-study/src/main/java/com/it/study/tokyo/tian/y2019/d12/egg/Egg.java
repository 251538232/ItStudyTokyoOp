package com.it.study.tokyo.tian.y2019.d12.egg;

import com.it.study.tokyo.tian.y2019.d12.itf.Eatable;

/**
 * Egg class
 *
 * @author tian
 */
public class Egg implements Eatable {

    private String name;

    public Egg() {
    }

    public Egg(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Throwable {
        Egg egg = new Egg("123");
        test(egg);
        System.out.println(egg.getName());
        if (egg.getName().equals("12333333")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int i = testEgg(4);
        if (5 == i) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    protected static int testEgg(int result) throws Throwable {
        return ++result;
    }

    protected static void test(Egg egg) throws Throwable {
        egg.setName("12333333");
    }

    @Override
    public String toString() {
        return "Egg{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void canEat() {
        System.out.println("egg can eat");
        System.out.print("egg can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
