package com.it.study.tokyo.tian.y2020.d0111;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TectDate {
    /**
     * G 	纪元标记 	AD
     * y 	四位年份 	2001
     * M 	月份 	July or 07
     * d 	一个月的日期 	10
     * h 	 A.M./P.M. (1~12)格式小时 	12
     * H 	一天中的小时 (0~23) 	22
     * m 	分钟数 	30
     * s 	秒数 	55
     * S 	毫秒数 	234
     * E 	星期几 	Tuesday
     * D 	一年中的日子 	360
     * F 	一个月中第几周的周几 	2 (second Wed. in July)
     * w 	一年中第几周 	40
     * W 	一个月中第几周 	1
     * a 	A.M./P.M. 标记 	PM
     * k 	一天中的小时(1~24) 	24
     * K 	 A.M./P.M. (0~11)格式小时 	10
     * z 	时区 	Eastern Standard Time
     * ' 	文字定界符 	Delimiter
     * " 	单引号 	`
     *
     * @param args
     */
    public static void main(String[] args) {
        Date start = new Date();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        Date end = new Date();
        // 日期比较函数 before after
        boolean isAfter = start.after(end);
        boolean isbefore = start.before(end);

        // 日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(new Date()));

        // 计算两个日期间隔天数
        // 2017-01-31 - 2020-04-20
        // 1970-01-01
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date s = DateUtils.parse("2017-01-31 00:00:00","yyyy-MM-dd 00:00:00");
        Date e = DateUtils.parse("2020-04-20 00:00:00","yyyy-MM-dd 00:00:00");
        System.out.println(s);
        System.out.println(e);
        s.setTime(e.getTime());
        System.out.println(s);
//        System.out.println(daysBetween(s, e));
    }


    private static long daysBetween(Date one, Date two) {
        long difference = (two.getTime() - one.getTime()) / (24 * 60 * 60 * 1000);
        return Math.abs(difference);
    }
}
