package com.it.study.tokyo.tian.y2020.d0307;

import java.io.File;
import java.io.IOException;

public class TestCreateFolder {
    public static void main(String[] args) throws IOException {
        String s = "C:/Users/qdmission/IdeaProjects/ItStudyTokyoOp/it-study/src/main/java/com/it/study/tokyo/tian/y2020/d0307/11/33/22/33.txt";
        System.out.println(s.substring(0, s.lastIndexOf("/")));
        String folderPath = s.substring(0, s.lastIndexOf("/"));
        File file = new File(s);
        file.mkdirs();
        file.createNewFile();


        s = "C:/Users/qdmission/IdeaProjects/ItStudyTokyoOp/it-study/src/main/java/com/it/study/tokyo/tian/y2020/d0307/44/22/22/33.txt";
        File file2 = new File(s);
        file2.getParentFile().mkdirs();
        file2.createNewFile();
    }
}
