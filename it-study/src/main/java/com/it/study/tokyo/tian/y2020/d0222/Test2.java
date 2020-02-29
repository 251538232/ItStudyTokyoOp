package com.it.study.tokyo.tian.y2020.d0222;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<Integer>(){{
            add(3);
            add(5);
            add(7);
            add(2);
            add(2);
        }};

        int min = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            if (min > lists.get(i)) {
                min = lists.get(i);
            }
        }

        // {3, 5, 7}
        for (int i = lists.size() - 1; i >= 0; i--) {
            if (lists.get(i) == min) {
                lists.remove(i);
            }
        }
        min = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            if (min > lists.get(i)) {
                min = lists.get(i);
            }
        }

        System.out.println(lists);
        System.out.println(min);


    }

}
