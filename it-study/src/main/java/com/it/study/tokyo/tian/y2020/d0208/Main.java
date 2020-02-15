package com.it.study.tokyo.tian.y2020.d0208;

import java.util.*;


public class Main {

    public static void main(String[] args) {

//        int count = 7;
//        char[] values = {'4', '5', '6', '7', '6', '5', '4', '4', '5', '6', '7', '6', '5', '4'};
//        int sum = sum(values, 0, 6);
//        int aver = sum / 3;
//        int i1 = chatToInt('9');
//        System.out.println(i1);
//        System.out.println(aver);
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
                    sum += (int) (c) - (int) ('0');
                }
                avg = sum / 3;
                // 制作成链表
                values = s.concat(s).toCharArray();
            }
        }
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
            int sumTmp = 0;
            int countTmp = 1;
            for (int j = 0; j <= i + maxCount - 1; j++) {
                sumTmp += ((int) (values[j]) - (int) ('0'));
                if (countTmp >= minCount) {
                    if (sumTmp >= avg) {
                        firstSums[0] = sumTmp;
                        firstSums[1] = j + 1;
                        firstSums[2] = countTmp;
                        break;
                    }
                }
                countTmp++;
            }
            if (firstSums[0] == 0) {
                firstSums[0] = sumTmp;
            }

            // second
            int[] secondSums = {0, 0};
            sumTmp = 0;
            for (int j = firstSums[1]; j <= firstSums[1] + maxCount - 1; j++) {
                sumTmp += ((int) (values[j]) - (int) ('0'));
                if (countTmp >= minCount) {
                    if (sumTmp >= avg) {
                        secondSums[0] = sumTmp;
                        secondSums[1] = j + 1;
                        break;
                    }
                }
                countTmp++;
            }
            if (secondSums[0] == 0) {
                secondSums[0] = sumTmp;
            }

            // third
            sums[i][0] = firstSums[0];
            sums[i][1] = secondSums[0];
            sums[i][2] = 0;
            for (int k = secondSums[1]; k <= i + count - 1; k++) {
                sums[i][2] += ((int) (values[k]) - (int) ('0'));
            }
        }

        int[] cha = new int[sums.length];
        for (int i = 0; i < sums.length; i++) {
            int max = sums[i][0];
            int min = sums[i][0];
            for (int k = 0; k < sums[i].length; k++) {
                int anInt = sums[i][k];
                if (anInt > max) {
                    max = anInt;
                }
                if (anInt < min) {
                    min = anInt;
                }
            }
            cha[i] = Math.abs(max - min);
        }
        int mincha = 9;
        for (int i = 0; i < cha.length; i++) {
            System.out.println(i + ".) " + String.valueOf(sums[i][0]) + "  " + (String.valueOf(sums[i][1])) + " " + (String.valueOf(sums[i][2])));
            int anInt = cha[i];
            if (anInt <= mincha) {
                mincha = anInt;
            }
        }
        System.out.println(mincha);
    }

}