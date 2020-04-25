package com.it.study.tokyo.tian.y2020.d0418;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudyTest {

    @Test
    public void getStr() {
    }

    @Test
    public void getFloat() {
        TestStudy testStudy = new TestStudy();
        // 单体测试  测试用例
        // 第一参数>0 第二参数随意
        // 当输入1.0f ，2  返回值 2.0
        float aFloat = testStudy.getFloat(1.0f, 2);

        // 断言
        assertEquals("2.0", String.valueOf(aFloat));
    }

    @Test
    public void getFloatMinus() {
        TestStudy testStudy = new TestStudy();
        // 单体测试  测试用例
        // 第一参数<0 第二参数随意
        // 当输入-2.0f ，2  返回值 -1.0
        float aFloat = testStudy.getFloat(-2.0f, 2);

        // 断言
        assertEquals("-1.0", String.valueOf(aFloat));
    }

    @Test
    public void getTestStudy() {
    }

    @Test
    public void getValue() {
    }
}