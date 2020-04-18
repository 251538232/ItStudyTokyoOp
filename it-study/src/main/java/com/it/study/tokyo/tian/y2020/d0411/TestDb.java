package com.it.study.tokyo.tian.y2020.d0411;

import com.it.utils.DbUtils;

import java.util.List;
import java.util.Map;

public class TestDb {

    public static void main(String[] args) throws Exception {
        List<Map<String, Object>> maps = DbUtils.executeSelectSql("select * from user");
        System.out.println(maps);
        String str = "123456";
        for (int i = 0; i < str.length(); i++) {

        }

    }
    private int get(String str , char i){
        for (int i1 = 0; i1 < str.toCharArray().length; i1++) {

        }
        return 1;
    }
}
