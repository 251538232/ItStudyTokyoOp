package com.it.study.tokyo.tian.y2020.d0229;

import java.io.*;

public class Test {
    public static void main(String args[]) {
        try {
            String pathname = "C:\\input.txt";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                line = br.readLine();
            }

            File writename = new File(".\\result\\en\\output.txt");
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            out.write("file file \r\n");
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
