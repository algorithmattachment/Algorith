package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

public class ArraysIntersectionTwoTest {
    private ArraysIntersectionTwo arraysIntersectionTwo;
    private Timer junit;

    @Before
    public void setUp() {
        arraysIntersectionTwo = new ArraysIntersectionTwo();
        junit = new Timer();
    }

    @Test
    public void test_intersect() {
        int[] a = Junit.getTestData(10000000, 10000);
        int[] b = Junit.getTestData(10000000, 10000);
        junit.startTime();
        arraysIntersectionTwo.intersect(a, b);
        junit.getTime();
    }
}