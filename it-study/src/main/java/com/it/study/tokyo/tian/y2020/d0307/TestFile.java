package com.it.study.tokyo.tian.y2020.d0307;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestFile {
    public static void main(String[] args) {
        // 1.新建文件 文件名定義
        // 2.学员名字写入
        // 3.保存
        FileOutputStream fop = null;
        OutputStreamWriter writer = null;
        try {
            File f = new File("C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\sat.txt");
            if (!f.exists()) {
                f.createNewFile();
                System.out.println(f.getAbsolutePath());
            }
            // 构建FileOutputStream对象,文件不存在会自动新建
            fop = new FileOutputStream(f);
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
            writer = new OutputStreamWriter(fop, "utf-8");
            writer.append("java工程师");
            writer.append("\r\n");
            writer.append("数据工程师");
            writer.append("\r\n");

        } catch (Exception e) {

        } finally {
            try {
                writer.close();
                fop.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fip = null;
        InputStreamReader reader = null;
        try {
            // 构建FileInputStream对象
            File f = new File("C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\sat.txt");
            fip = new FileInputStream(f);
            // 构建InputStreamReader对象,编码与写入相同
            reader = new InputStreamReader(fip, "UTF-8");
            BufferedReader bf = new BufferedReader(reader);
//            String ss;
//            int i = 1;
//            while ((ss = bf.readLine()) != null) {
//                System.out.println(i + ". " + ss);
//                i++;
//            }
            ArrayList<String> collect = bf.lines().collect(Collectors.toCollection(ArrayList::new));
            System.out.println(collect);
        } catch (Exception e) {

        } finally {
            try {
                // 关闭读取流
                reader.close();
                // 关闭输入流,释放系统资源
                fip.close();
            } catch (Exception e) {

            }
        }


    }
}