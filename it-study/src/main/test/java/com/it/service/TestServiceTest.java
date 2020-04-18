package com.it.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestServiceTest {



    @Test
    public void testSend() {
    }

    @Test
    public void multi() {
        TestService testService = new TestService();
        String multi = testService.multi(100);
        assertEquals("10000" ,multi);
    }
}