package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MobileZreoTest {

    private MobileZreo mobileZreo;
    private Timer timer;
    @Before
    public void setUp() {
        mobileZreo = new MobileZreo();
        timer = new Timer();
    }
    @Test
    public void test_moveZeroes() {
        timer.startTime();
        mobileZreo.moveZeroes(Junit.getTestData(10, 10));
        System.out.println(timer.getTime());
    }
}