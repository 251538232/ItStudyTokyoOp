package com.it.study.tokyo.tian.y2020.d0118;

import java.sql.*;

public class TestSqlite {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String db = "C:\\Users\\ts-wen.tian\\IdeaProjects\\ItStudyTokyoOp\\doc\\test.db";
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + db);
        PreparedStatement state = conn.prepareStatement("select * from USER");
        //查询数据
        ResultSet rs = state.executeQuery();
        while (rs.next()) {
            System.out.println("USER_NAME = " + rs.getString("USER_NAME") + " ");
            System.out.println("PASS_WD = " + rs.getString("PASS_WD"));
        }
        rs.close();
        conn.close();

    }

}
