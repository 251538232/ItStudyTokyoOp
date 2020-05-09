package com.it.study.tokyo.tian.y2020.d0425;

public class MyBean {
    public MyBean() {
    }

    public MyBean(String text, int len) {
        this.text = text;
        this.len = len;
    }

    private String text;
    private int len;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLen() {
        // 1
        // 2
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
