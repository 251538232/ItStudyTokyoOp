package com.it.study.tokyo.tian.y2020.d0425;

public class Jstudy {

    MyBean myBean;

    // 1
    public int getMulti(int i, int j) {
        return i * j + j;
    }

    // 2
    public float getMulti(float i, float j) {
        return i * j + j;
    }

    // 3
    public void setMyBean() {
        this.myBean = new MyBean("test", 0);
    }

    @Deprecated
    public MyBean getMyBean() {
        return myBean;
    }
}
