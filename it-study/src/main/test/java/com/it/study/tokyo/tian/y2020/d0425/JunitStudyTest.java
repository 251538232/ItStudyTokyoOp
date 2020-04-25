package com.it.study.tokyo.tian.y2020.d0425;

import org.junit.Test;

import static org.junit.Assert.*;

public class JunitStudyTest {

    @Test
    public void setTestMyBean() {
    }

    @Test
    public void set() {
        JunitStudy junitStudy = new JunitStudy();
        junitStudy.set(200);
        assertEquals(200, junitStudy.getMyBean().getLen());

    }
}