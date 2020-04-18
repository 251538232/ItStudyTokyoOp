package com.it.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

public class TestServiceTest {

    TestService testService = new TestService();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sendTest() throws Exception {
        // "aaa222"
        String s = testService.send("aaa");
        assertEquals("aaa222", s);
    }

    @Test
    public void multiTest() {
        String s = testService.multi(100);
        assertEquals("10000", s);
    }

    @Test
    public void multiTest2() {
        String s = testService.multi(10);
        assertEquals("123", s);
    }

    @Test
    public void testSendTest() {
        try {
            String s = testService.testSend();
            assertEquals("321", s);
        } catch (Exception e) {
            assertTrue(e instanceof ConnectException);
        }
    }
}