package com.it.study.tokyo.tian.y2020.d0111;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理
 */
public class DateUtils {

  /**
   * 時間フォーマット(yyyy-MM-dd)
   */
  public final static String YYYY_MM_DD = "yyyy-MM-dd";

  /**
   * 時間フォーマット(yyyy-MM-dd HH:mm:ss)
   */
  public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

  /**
   * 時間フォーマット(yyyyMMddHHmmss)
   */
  public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
  /**
   * 時間フォーマット(yyyyMMdd_HHmmss)
   */
  public final static String YYYYMMDD_HHMMSS = "yyyyMMdd_HHmmss";

  /**
   * 時間フォーマット(yyyy-MM-dd 00:00:00)
   */
  public final static String YYYY_MM_DD_00_00_00 = "yyyy-MM-dd 00:00:00";

  public static String formatYMD000(Date date) {
    return format(date, YYYY_MM_DD_00_00_00);
  }

  public static String formatYMD(Date date) {
    return format(date, YYYY_MM_DD);
  }

  public static String formatYMDHMS(Date date) {
    return format(date, YYYY_MM_DD_HH_MM_SS);
  }

  public static String formatYMDHMSTrim(Date date) {
    return format(date, YYYYMMDDHHMMSS);
  }

  public static String format(Date date, String pattern) {
    if (date != null) {
      SimpleDateFormat df = new SimpleDateFormat(pattern);
      return df.format(date);
    }
    return null;
  }

  /**
   * 当日0時0分0秒のDate情報を取得
   *
   * @return 当日0時0分0秒
   */
  public static Date parse(String dateStr, String pattern) {
    try {
      if (dateStr != null) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.parse(dateStr);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 当日0時0分0秒のDate情報を取得
   *
   * @return 当日0時0分0秒
   */
  public static Date nowYmd() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    return calendar.getTime();
  }
}
