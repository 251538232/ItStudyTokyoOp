package com.it.study.tokyo.tian;

public class TianMainTest {


    public static void main(String[] args) {
        // 当传入参数为0时  期望返回值：“000”
        // 当传入参数为1时  期望返回值：“444”
        System.out.println("123");
        String test = test(0);
        if (test.equals("000")){
            System.out.println("ok");
        }

        String test1 = test(1);
        String test2 = test(4);

    }

    public  TianMainTest testMainTst(Integer i){
        test1(i);
        return new TianMainTest();
    }


    public static void testMain(Integer i){
        test1(i);
    }

    public static String test(Integer i){
        test1(i);
        if (i==0){
            return "000";
        }else if(i==4) {
            return "444";
        }else {
            return "sss";
        }
    }

    public static String test1(Integer i){
        if (i==0){
            return "000";
        }else if(i==4) {
            return "444";
        }else {
            return "sss";
        }
    }

}
