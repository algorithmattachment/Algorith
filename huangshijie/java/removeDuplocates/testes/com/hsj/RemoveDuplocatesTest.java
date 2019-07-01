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
        Runtime.getRuntime().gc();
        long startTime = Junit.getTime();
        long startMemory = Junit.getMemory();
        System.out.println(removeDuplocates.removeDuplicates(test));
        long endTime = Junit.getTime();
        // Runtime.getRuntime().gc();
        long endMemory = Junit.getMemory();
        System.out.println("运行时间："+(endTime - startTime) / 1000000000+"s");
        System.out.println("消耗内存：" + (startMemory - endMemory) / (1024 * 1024) + "M");
    }
    @Test
    public void test_2() {
        timerJunit.startTime();
        removeDuplocates.removeDuplicates(Junit.getTestData(10000000, 100000));
        System.out.println(timerJunit.getTime());

    }

}