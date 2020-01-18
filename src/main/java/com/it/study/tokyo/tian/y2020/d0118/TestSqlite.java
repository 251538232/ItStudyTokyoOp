package com.it.study.tokyo.tian.y2020.d0118;

import java.sql.*;

public class TestSqlite {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 所谓驱动：老王给我打电话  我就睡觉
        // 所谓驱动：老王请我吃饭    我就换衣服
        // 所谓驱动：老王睡觉        我就醒着
        // "select * from user"    从user表取数据
        // 1. 加载驱动
        // 2. 建立连接
        // 3. 执行sql 命令 [select 获取结果集]
        // 4. 关闭结果集
        // 5. 关闭连接

        Class.forName("org.sqlite.JDBC");
        String db = "C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\doc\\test.db";
        // 建立连接  不能隔山打牛
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + db);
        // "select * from user" （老王给我打电话） 命令标准  （老王去坐飞机）：对我无效的命令
        PreparedStatement state = conn.prepareStatement("select * from user");
        //查询数据
        ResultSet rs = state.executeQuery();
        while (rs.next()) {
            System.out.println("USER_NAME = " + rs.getString("USER_NAME") + " ");
            System.out.println("PASS_WD = " + rs.getString("PASS_WD"));
            System.out.println("AGE = " + rs.getString("AGE"));
        }
        rs.close();
        state.close();
        conn.close();

    }

}
