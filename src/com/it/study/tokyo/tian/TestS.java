package com.it.study.tokyo.tian;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestS {

    public static void main(String[] args) {
        // array [1,3,5]
        List<String> aryList = new ArrayList<String>();
        // 链表
        // {1}->{3}->{5}
        LinkedList<String> linkedList = new LinkedList<>();
        int count=100000;
        // init array list
        for (int i = 0; i < count; i++) {
            aryList.add("ary" + i);
        }

        // init linked list
        for (int i = 0; i < count; i++) {
            linkedList.add("linkedList" + i);
        }

        // 查找快
        long start = System.currentTimeMillis();
        for (int i = 0; i < aryList.size(); i++) {
            aryList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        // 查找慢 查的时候少，但是插入操作多
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        System.out.println(System.currentTimeMillis() - end);



        // 1，2，3，4  【    】
        // 1，2，3，4,5       【     】

        int addCount =10011110;
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < addCount; i++) {
            aryList.add("arytest" + i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        // 1 -> 2-> 3 -> 3.5 ->4 -> 5
        for (int i = 0; i < addCount; i++) {
            linkedList.add("linkedListtest" + i);
        }
        System.out.println(System.currentTimeMillis() - end1);

    }
}
