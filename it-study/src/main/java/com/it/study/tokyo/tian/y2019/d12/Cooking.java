package com.it.study.tokyo.tian.y2019.d12;


import com.it.study.tokyo.tian.y2019.d12.egg.Egg;
import com.it.study.tokyo.tian.y2019.d12.veg.Vegetables;

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
