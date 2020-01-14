package com.it.study.tokyo.tian.y2019.d1228;

import java.util.ArrayList;
import java.util.List;

public class TestSwitch {
    public static void main(String[] args) {
        List<Integer> intList = init();
        for (Integer integer : intList) {
            System.out.println("now " + integer + " ");
            switch (integer){
                case 4:
                    System.out.println("i am four");
                    break;
                case 3:
                    System.out.println("i am three");
                    break;
                case 1:
                case 2:
                case 8:
                    System.out.println("i am 1 or 2 or 8");
                    break;
                default:
                    break;
            }
        }

    }

    private static List<Integer> init() {
        return new ArrayList() {
            {
                add(4);
                add(3);
                add(1);
                add(2);
                add(8);
            }
        };
    }
}
