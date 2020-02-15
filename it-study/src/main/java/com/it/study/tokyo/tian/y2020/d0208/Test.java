package com.it.study.tokyo.tian.y2020.d0208;

import java.util.*;

public class Test {


    public static void main(String[] args) {

//        int count = 7;
//        char[] values = {'4', '5', '6', '7', '6', '5', '4', '4', '5', '6', '7', '6', '5', '4'};
//        int sum = sum(values, 0, 6);
//        int aver = sum / 3;
//        int i1 = chatToInt('9');
//        System.out.println(i1);
//        System.out.println(aver);
        // 总数
        int count = 0;
        char[] values = null;
        int sum = 0;
        int avg = 0;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.nextLine();
            if (s != null && !s.trim().equals("") && count == 0) {
                count = Integer.parseInt(s);
            }
            sc = new Scanner(System.in);
            if (sc.hasNext()) {
                s = sc.nextLine();
                for (char c : s.toCharArray()) {
                    sum += chatToInt(c);
                }
                avg = sum / 3;
                // 制作成链表
                values = s.concat(s).toCharArray();
            }
        }
        System.out.println(String.valueOf(count));
        System.out.println(new String(values));
        // 0 - values/2-1
        // values/2-1 ~values
        int[][] sums = new int[count][3];
        int maxItm = 0;
        // 因为每个数字最大为9
        // 获取平均值与最大元素数
        int minCount = avg % 9 == 0 ? avg / 9 : avg / 9 + 1;
        int maxCount = count - minCount;

        for (int i = 0; i <= count - 1; i++) {
            int[] firstSums = sumByIndex(values, i, minCount, maxCount, avg);

            // second
            int[] secondSums = new int[2];
            for (int j = firstSums[1]; j <= values.length - 1; j++) {
                secondSums = sumByIndex(values, firstSums[1], minCount, maxCount - firstSums[2], avg);
                if (secondSums[0] == 0) {
                    continue;
                }
                break;
            }
            // third
            sums[i][0] = firstSums[0];
            sums[i][1] = secondSums[0];
            sums[i][2] = sumByIndex(values, secondSums[1], i + count - 1);
        }

        int[] cha = new int[sums.length];
        for (int i = 0; i < sums.length; i++) {
            System.out.println(i + ".) " + String.valueOf(sums[i][0]) + "  " + (String.valueOf(sums[i][1])) + " " + (String.valueOf(sums[i][2])));
            int[] mm = maxmin(sums[i]);
            cha[i] = Math.abs(mm[0] - mm[1]);
        }
        System.err.println(maxmin(cha)[1]);
    }

    /**
     * maxmin
     */
    private static int[] maxmin(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            if (anInt > max) {
                max = anInt;
            }
            if (anInt < min) {
                min = anInt;
            }
        }
        return new int[]{max, min};
    }

    /**
     * 指定开始结束位置 求和
     *
     * @param chars
     * @param s
     * @param e
     * @return
     */
    private static int sumByIndex(char[] chars, int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += chatToInt(chars[i]);
        }
        return sum;
    }

    private static int[] sumByIndex(char[] chars, int s, int minCount, int maxCount, int avg) {
        int[] sums = {0, 0, 0};
        int sum = 0;
        int count = 1;
        for (int i = s; i <= s + maxCount - 1; i++) {
            sum += chatToInt(chars[i]);
            if (count >= minCount) {
                if (sum >= avg) {
                    sums[0] = sum;
                    sums[1] = i + 1;
                    sums[2] = count;
                    break;
                }
            }
            count++;
        }
        if (sums[0] == 0) {
            sums[0] = sum;
        }
        return sums;
    }

    private static int chatToInt(char i) {
        return (int) i - (int) ('0');
    }
}
