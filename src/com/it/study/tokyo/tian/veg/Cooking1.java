package com.it.study.tokyo.tian.veg;


import com.it.study.tokyo.tian.egg.Egg;

/**
 * Cooking class
 *
 * @author tian
 */
public class Cooking1 {

    /**
     * cook food with vegetables and egg
     */
    public void cookVegAndEgg(Vegetables vegetables, Egg egg) {
        System.out.println(("cook " + vegetables.getName() + " and " + egg.getName()));
    }
}
