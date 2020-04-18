package com.it.study.tokyo.song;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.List;

public class StudyString {
    private List<Integer> getCharIndex(String str, char cha, char c, StudyString ss) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha && str.charAt(i) == c) {
                list.add(i);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        StudyString ss = new StudyString();
        System.out.println(new StudyString().getCharIndex("abc私はエンジニア123", '私', 'は', ss));


    }
}
