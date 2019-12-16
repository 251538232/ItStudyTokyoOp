package com.it.study.tokyo.tian;

import com.it.study.tokyo.tian.egg.Egg;
import com.it.study.tokyo.tian.veg.Vegetables;

/**
 * Cooking class
 *
 * @author tian
 */
public class Cooking {

    /**
     * cook food with vegetables and egg
     */
    public void cookVegAndEgg(Vegetables vegetables, Egg egg) {
        System.out.println(("cook " + vegetables.getName() + " and " + egg.getName()));
    }
}
