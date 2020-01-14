package com.it.study.tokyo.tian.y2019.d1228;

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
        long end =999999999;
        // 客户需求：获取从1加到9999999999999（连续值）的和
        // -2^31 ----- 2^31 - 1
//        // input: 1~100
//        // out: 和
        long result = 0;
        for (long j = 1; j <= end; j++) {
            result +=j;
        }

        long start = System.currentTimeMillis();
        // 循環
        System.out.println(caculateFromTo(1, end));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - start + "ms");
        // 公式
        System.out.println(caculateFromToGaosi(1, end));
        System.out.println(System.currentTimeMillis() - endTime +"ms");
    }

    /**
     * first~to plus -> result
     * @param first
     * @param end
     * @return
     */
    public static long caculateFromToGaosi(long first, long end) {
        long result = 0;
        // 高斯算数
        //     1  2  3 ---- 97 98 99 100
        // 100 99 98 97 ----3  2  1
        // 1 ： 50 * 100 + 50
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
