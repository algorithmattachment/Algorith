package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetOfTest {
    private SubsetOf subsetOf;
    private Timer timer;
    @Before
    public void setUp() {
        subsetOf = new SubsetOf();
        timer = new Timer();
    }

    @Test
    public void test_subsets() {
        timer.startTime();
        subsetOf.subsets(Junit.getTestData(9, 10));
        System.out.println(timer.getTime(1));
    }
}