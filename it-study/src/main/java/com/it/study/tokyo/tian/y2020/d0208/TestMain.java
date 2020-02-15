package com.it.study.tokyo.tian.y2020.d0208;

import java.util.Scanner;

public class TestMain {


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
        char[] chars = null;
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
                chars = s.concat(s).toCharArray();
            }
        }
        System.out.println(String.valueOf(count));
        System.out.println(new String(chars));
        // 0 - values/2-1
        // values/2-1 ~values
        int[][] sums = new int[count][3];
        int maxItm = 0;
        // 因为每个数字最大为9
        // 获取平均值与最大元素数
        int minCount = avg % 9 == 0 ? avg / 9 : avg / 9 + 1;
        int maxCount = count - minCount;

        for (int i = 0; i <= count - 1; i++) {
            int[] firstSums = {0, 0, 0};
            int sum1 = 0;
            int count1 = 1;
            for (int j = i; j <= i + maxCount - 1; j++) {
                sum1 += chatToInt(chars[j]);
                if (count1 >= minCount) {
                    if (sum1 >= avg) {
                        firstSums[0] = sum1;
                        firstSums[1] = j + 1;
                        firstSums[2] = count1;
                        break;
                    }
                }
                count1++;
            }
            if (firstSums[0] == 0) {
                firstSums[0] = sum1;
            }

            // second
            int[] secondSums = {0, 0, 0};
            int sum2 = 0;
            int count2 = 1;
            for (int j = firstSums[1]; j <= firstSums[1] + maxCount - 1; j++) {
                sum2 += chatToInt(chars[j]);
                if (count2 >= minCount) {
                    if (sum2 >= avg) {
                        secondSums[0] = sum2;
                        secondSums[1] = j + 1;
                        secondSums[2] = count2;
                        break;
                    }
                }
                count2++;
            }
            if (secondSums[0] == 0) {
                secondSums[0] = sum2;
            }

            // third
            sums[i][0] = firstSums[0];
            sums[i][1] = secondSums[0];
            System.out.println((i + count - 1));
            System.out.println(i);
            for (int j = secondSums[1]; j <= i + count - 1; j++) {
                sums[j][2] += chatToInt(chars[j]);
            }
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


    private static int chatToInt(char i) {
        return (int) i - (int) ('0');
    }
}
