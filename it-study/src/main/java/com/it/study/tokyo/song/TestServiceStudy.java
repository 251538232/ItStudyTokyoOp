package com.it.study.tokyo.song;

import com.google.common.annotations.VisibleForTesting;
import com.it.service.TestService;
import com.it.study.tokyo.tian.y2020.d0418.TestStudy;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceStudy {
    TestService testService = new TestService();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sendTest() throws Exception {
        String s = testService.send("bbb");
        int i = testService.send(1);
        String s2 = s + i.toString();
        assertEquals("bbb1", s2);
    }

    @Test
    public void multiTest() {
        float f = testService.multi(0.1);
        int i = testService.multi(1);
        float f2 = f + (float) i;
        assertEquals(1.1, f2);

        float fl = testService.multi(-0.1);
        int in = testService.multi(2);
        float fl2 = fl + (float) in;
        assertEquals(-0.2, fl2);


    }


    @Test
    public void multiTest2

    {
        float f = testService.multi(0.2);
        int i = testService.multi(1);
        TestStudy testStudy = testService.multi(String.valueOf(f * i));
        float f2 = f * (float) i;
        assertEquals(0.2, f2);
    }

    @Test
    public void multiTest3{
        String s = testService.multi(null);
        assertEquals(null,s);
    }
}
