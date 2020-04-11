package com.it.study.tokyo.tian.y2020.d0411;

import com.it.utils.DbUtils;

import java.util.List;
import java.util.Map;

public class TestDb {

    public static void main(String[] args) throws Exception {
        List<Map<String, Object>> maps = DbUtils.executeSelectSql("select * from user");
        System.out.println(maps);

    }
}
