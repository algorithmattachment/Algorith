package com.hsj;

import com.tool.Junit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysIntersectionTest {
    private ArraysIntersection arraysIntersection;
    @Before
    public void setUp() {
        arraysIntersection = new ArraysIntersection();
    }
    @Test
    public void test_intersection() {
        int[] a = Junit.getTestData(10000000, 10000);
        int[] b = Junit.getTestData(10000000, 10000);

        arraysIntersection.intersection(a, b);


    }

}
