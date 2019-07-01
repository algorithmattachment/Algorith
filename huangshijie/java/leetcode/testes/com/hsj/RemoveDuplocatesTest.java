package com.hsj;

import com.tool.Junit;
import com.tool.TimerJunit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplocatesTest {

    private RemoveDuplocates removeDuplocates;
    private TimerJunit timerJunit;
    @Before
    public void setUp() {
        removeDuplocates = new RemoveDuplocates();
        timerJunit = new TimerJunit();
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
