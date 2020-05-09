package com.it.study.tokyo.tian.y2020.d0425;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JstudyTestHui {


//    @Test
//    public void getMulti() {
//
//        int i = jstudy.getMulti(1,2);
//        assertEquals(4,i);
//
//    }
//
//    @Test
//    public void testGetMulti() {
//        Jstudy jstudy = new Jstudy();
//        float f = jstudy.getMulti(1.0f,3.0f);
//        assertEquals("6.0", String.valueOf(f));    // why f is int?
//    }
//
//    @Test
//    public void setTest(){
//        Jstudy jstudy = new Jstudy();
//        int k = 100;
//        jstudy.setITest(k);
//        assertEquals(3,k);
//    }
//    @Test
//    public void setTest2(){
//
//        Jstudy jstudy = new Jstudy();
//
//        MyBean myBean = new MyBean();
//        myBean.setLen(555);
//
//        jstudy.setTestInteger(myBean);
//
//        assertEquals(3, myBean.getLen());
//    }
//
//    @Test
//    public void setMyBean() {
//        // 测试对象类
//        Jstudy jstudy = new Jstudy();
//        // 测试对象方法调用(要么有返回值 or 要么内存发生变化)
//        jstudy.setMyBean();
//        // 断言（值or 对象的变化）
//        assertEquals(0,jstudy.myBean.getLen());
//        assertEquals("test",jstudy.myBean.getText());
//
//    }

    @Test
    public void testBean() {
        MyBean myBean = mock(MyBean.class);
        Jstudy jstudy = new Jstudy(myBean);

        when(myBean.getLen()).thenReturn(10000);

        int i = jstudy.setTestInteger(myBean);
        assertEquals(3, i);
    }
}