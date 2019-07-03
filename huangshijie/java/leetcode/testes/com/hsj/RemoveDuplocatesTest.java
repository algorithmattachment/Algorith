package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplocatesTest {

    private RemoveDuplocates removeDuplocates;
    private Timer timerJunit;
    @Before
    public void setUp() {
        removeDuplocates = new RemoveDuplocates();
        timerJunit = new Timer();
    }

    @Test
    public void removeDuplicates() {
        int test[] = Junit.getTestData(10000000, 100000);

        System.out.println(removeDuplocates.removeDuplicates(test));

    }
    @Test
    public void test_2() {
        timerJunit.startTime();
        removeDuplocates.removeDuplicates(Junit.getTestData(10000000, 100000));
        System.out.println(timerJunit.getTime());

    }

}
