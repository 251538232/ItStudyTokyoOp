package com.it.study.tokyo.tian;

import java.util.ArrayList;
import java.util.List;

public class TestFor {
    /**
     * test for
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList() {
            {
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(3);
                add(4);// delete
                add(4);// delete
                add(3);
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(4);// delete
                add(3);
                add(4);// delete
                add(4);// delete
            }
        };
        Integer[] intArray = {3, 4, 5, 6, 7, 8};
        // 4,5,4,4    0
        // 5,4,4      1
        // 5,4        2
        // 5,4
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 4) {
                intList.remove(i);
            }
        }
        // go on

        // 4,5,4,4    3
        // 4,5,4      2
        // 4,5        1
        // 5          0
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.println("i :" + i +"  size: " + intList.size());
            if (intList.get(i) == 4) {
                intList.remove(i);
            }
        }
        System.out.println(intList.toString());
    }

}
