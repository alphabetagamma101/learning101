package com.alpha.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

    @Test
    public void test1() {
        Sample sample = new Sample();
        assertEquals("this is a test", sample.test1());
    }
}
