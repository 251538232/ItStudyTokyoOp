package com.it.study.tokyo.tian.y2020.d0425;

public class JunitStudy {
    private String name;

    private MyBean myBean;

    // 题目
    public void setTestMyBean(MyBean bean){
        bean.setLen(2);
        bean.setText("beanName");
        this.myBean=bean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }



}
