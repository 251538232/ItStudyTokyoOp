package com.it.study.tokyo.tian.y2020.d0418;

import com.it.study.tokyo.tian.y2019.d12.egg.Egg;

/**
 * 20200418 作业
 */
public class TestStudy {
    private String value;

    public String getStr(String str, int i) {
        return str + i;
    }

    public void setTestStudyValue(Egg egg) {
        egg.setName("鹅蛋");
    }

    public float getFloat(float f, int i) {
        if (f < 0.0) {
            return -1;
        }
        return f * i;
    }

    public TestStudy getTestStudy(float f, int i) {
        TestStudy testStudy = new TestStudy();
        testStudy.value = String.valueOf(f * i);
        return testStudy;
    }

    public String getValue() {
        return value;
    }
}
