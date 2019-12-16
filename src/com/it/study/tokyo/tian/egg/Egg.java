package com.it.study.tokyo.tian.egg;

import com.it.study.tokyo.tian.itf.Eatable;

/**
 * Egg class
 *
 * @author tian
 */
public class Egg implements Eatable {

    private String name;

    @Override
    public void canEat() {
        System.out.println("egg can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
