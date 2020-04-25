package com.it.study.tokyo.tian.y2020.d0418;

import com.it.study.tokyo.tian.y2019.d12.egg.Egg;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudyTest {
    @Test
    public void getStr() {
        TestStudy testStudy = new TestStudy();
        String str = testStudy.getStr("123", 100);
        assertEquals("123100", str);
    }


    @Test
    public void getFloat() {
        // 1. 测试对象类 的 类对象 new
        // 2. 设计我们的测试用例（输入输出） ，方法调用
        // 3. 断言
        TestStudy testStudy = new TestStudy();

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

    @Test
    public void setTestStudyValue() {
        TestStudy testStudy = new TestStudy();
        Egg egg = new Egg();
        testStudy.setTestStudyValue(egg);
        assertEquals("鹅蛋",egg.getName());
    }
}