package com.it.study.tokyo.tian.y2020.d0509;

public class MyStudy {
    TeBean teBean;

    public MyStudy() {
    }

    public MyStudy(TeBean teBean) {
        this.teBean = teBean;
    }

    public String setMyName() {
        return teBean.getName() + "123";
    }
}
