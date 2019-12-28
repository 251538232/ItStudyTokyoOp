package com.it.study.tokyo.tian;

/**
 * 算法
 */
public class TestAlgorithm {

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        long i = 1;
        // 计算从0-100
        // 开始时间 1970/01/01 00:00:00 到现在的毫秒数
        long start = System.currentTimeMillis();
        // 循環
        System.out.println(caculateFromTo(1, 999999999));
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        // 公式
        System.out.println(caculateFromToTwo(1, 999999999));
        System.out.println(System.currentTimeMillis() - end +"ms");
    }

    /**
     * first~to plus -> result
     * @param first
     * @param end
     * @return
     */
    public static long caculateFromToTwo(long first, long end) {
        long result = 0;
        // 高斯算数
        //     1  2  3 ---- 97 98 99 100
        // 100 99 98 97 ----3  2  1
        // 1 ： 50 * 100 + 50
        // 2,3,4
        //  (1 + 100) * 100 / 2
        result = (first + end) * (end - first + 1) /2;
        return result;
    }

    /**
     * first~to plus -> result
     * @param first
     * @param end
     * @return
     */
    public static long caculateFromTo(long first, long end) {
        long result = 0;
        for (long i = first; i <= end; i++) {
            result += i;
        }
        return result;
    }
}
