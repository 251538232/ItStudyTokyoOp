package com.it.study.tokyo.zhanghui;

public class Test {

    static {
        System.out.println("a");
    }

    /**
     * stest方法
     *
     * @param args 参数
     */
    public static void main(String[] args){
        
        Tomato tomato = new Tomato();

        Egg egg = new Egg();
        Fire fire = new Fire();
        Fry fry = new Fry();
        Seasoning seasoning = new Seasoning();

        tomato.wash();
        tomato.cut();
        egg.stir();

        fire.fireOn();
        fry.fryEgg();
        fry.fryTomato();
        tomato.cut();
        seasoning.add();
        seasoning.add();
        fire.fireOff();

    }
}
