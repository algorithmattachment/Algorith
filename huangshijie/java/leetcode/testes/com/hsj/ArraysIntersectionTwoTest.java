package com.hsj;

import com.tool.Junit;
import com.tool.TimerJunit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysIntersectionTwoTest {
    private ArraysIntersectionTwo arraysIntersectionTwo;
    private TimerJunit junit;

    @Before
    public void setUp() {
        arraysIntersectionTwo = new ArraysIntersectionTwo();
        junit = new TimerJunit();
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