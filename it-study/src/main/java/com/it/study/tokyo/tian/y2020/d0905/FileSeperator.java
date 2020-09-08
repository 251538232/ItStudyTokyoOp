package com.it.study.tokyo.tian.y2020.d0905;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSeperator {
    public static void main(String[] args) throws Exception {
//        createFile();
        long l = System.currentTimeMillis();
        splitFile();
        System.out.println((System.currentTimeMillis() - l));
    }

    public static void splitFile() throws Exception {
        File f = new File("C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\test200000.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            int lineCount =0;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                if (str.contains("joblog")){
                    if (lineCount == 0){
                        lineCount++;
                    } else {
                        createFile(getFileName(arrayList.get(3)), arrayList);
                        arrayList.clear();
                    }
                }
                arrayList.add(str);
            }
            createFile(getFileName(arrayList.get(3)), arrayList);
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName(String text) {
        return text.split(" ")[5];
    }
    //createFile
    public static void createFile() throws Exception{
        File f = new File("C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\test200000.txt");
        if (f.exists()){
            f.delete();
            f.createNewFile();
        }
        FileOutputStream fileStream=new FileOutputStream(f, true);
        OutputStreamWriter streamWriter = new OutputStreamWriter(fileStream);
//        "joblog","joblog""joblog"
        int allLineCount = 200000;
        int subCount = 20000;
        for (int i = 0; i < allLineCount; i++) {
            if (i % subCount == 0){
                streamWriter.write(i+ " : -----------------joblog---------------\n");
            }else{
                streamWriter.write(i +" : 2020-09-0515:00:00 foxmail alibaba filname"+ i + " tesla qiangge \n");
            }
        }
        streamWriter.flush();
        streamWriter.close();
    }

    //createFile
    public static void createFile(String fileName,List<String> contents) throws Exception{
        File f = new File("C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\split\\" + fileName + ".txt");
        if (f.exists()){
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
        FileOutputStream fileStream=new FileOutputStream(f, true);
        OutputStreamWriter streamWriter = new OutputStreamWriter(fileStream);
        for (int i = 0; i < contents.size(); i++) {
            streamWriter.write(contents.get(i) + "\n");
        }
        streamWriter.flush();
        streamWriter.close();
    }
}
