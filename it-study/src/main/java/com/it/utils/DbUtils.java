package com.it.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {

    public static List<Map<String, Object>> executeSelectSql(String sql) throws Exception{
        Class.forName("org.sqlite.JDBC");
        // 建立连接
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + "C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\doc\\test.db");
        // "select * from user"
        PreparedStatement state = conn.prepareStatement(sql);
        //查询数据
        ResultSet rs = state.executeQuery();
        List<Map<String, Object>> result = resultSetToList(rs);
        rs.close();
        state.close();
        conn.close();

        return result;
    }

    private static List<Map<String, Object>> resultSetToList(ResultSet rs)
            throws SQLException {
        List<Map<String, Object>> results = new ArrayList<>();
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        List<String> colNameList = new ArrayList<>();
        for (int i = 0; i < colCount; i++) {
            colNameList.add(rsmd.getColumnName(i + 1));
        }
        while (rs.next()) {
            Map map = new HashMap<String, Object>();
            for (int i = 0; i < colCount; i++) {
                String key = colNameList.get(i);
                Object value = rs.getObject(colNameList.get(i));
                map.put(key, value);
            }
            results.add(map);
        }
        return results;
    }

}
