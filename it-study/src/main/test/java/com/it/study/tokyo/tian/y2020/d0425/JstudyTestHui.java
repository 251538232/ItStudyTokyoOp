package com.it.study.tokyo.tian.y2020.d0425;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JstudyTestHui {

    @Test
    public void getMulti() {
        Jstudy jstudy = new Jstudy();
        int i = jstudy.getMulti(1,2);
        assertEquals(4,i);

    }

    @Test
    public void testGetMulti() {
        Jstudy jstudy = new Jstudy();
        float f = jstudy.getMulti(1.0f,3.0f);
        assertEquals(6,(int)f);    // why f is int?

    }

    @Test
    public void setMyBean() {
        Jstudy jstudy = new Jstudy();
        jstudy.setMyBean() ;
        assertEquals(0,jstudy.getMyBean().getLen());
        assertEquals("test",jstudy.getMyBean().getText());

    }
}