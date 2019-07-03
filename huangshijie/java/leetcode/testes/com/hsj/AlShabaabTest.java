package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlShabaabTest {
    private AlShabaab alShabaab;
    private Timer timer;
    @Before
    public void setUp() {
        alShabaab = new AlShabaab();
        timer = new Timer();
    }

    @Test
    public void test_rob() {
        timer.startTime();
        System.out.println(alShabaab.rob(Junit.getTestData(10, 100)));
        System.out.println(timer.getTime(1));
    }
}