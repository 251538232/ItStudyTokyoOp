package com.it.study.tokyo.tian.y2020.d0425;

import org.springframework.beans.factory.annotation.Autowired;

public class Jstudy {

    MyBean myBean;

    public Jstudy(){
    }

    public Jstudy(MyBean myBean){
        this.myBean = myBean;
    }


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
    // 3
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
    public void setITest(int i) {
       i = 1 +2 ;
    }

    public int setTestInteger(MyBean myBean) {
        myBean.setLen(3);
        int len = myBean.getLen();
        len ++;
        return len;
    }

    @Deprecated
    public MyBean getMyBean() {
        return myBean;
    }
}
