package com.it.study.tokyo.tian.egg;

import com.it.study.tokyo.tian.itf.Eatable;

/**
 * Egg class
 *
 * @author tian
 */
public class Egg implements Eatable {

    private String name;

    public Egg(String name) {
        this.name = name;
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

}
