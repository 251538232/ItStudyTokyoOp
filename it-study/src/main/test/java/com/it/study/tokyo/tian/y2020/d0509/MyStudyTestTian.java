package com.it.study.tokyo.tian.y2020.d0509;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyStudyTestTian {

    @Test
    public void setMyName() {
        TeBean teBean = mock(TeBean.class);
        MyStudy myStudy = new MyStudy(teBean);
        when(teBean.getName()).thenReturn("456");
        String s = myStudy.setMyName();
        assertEquals("456123", s);

    }
}