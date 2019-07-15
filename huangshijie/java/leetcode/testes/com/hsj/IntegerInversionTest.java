package com.hsj;

import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class IntegerInversionTest {
    private IntegerInversion integerInversion;
    private Timer timer;

    @Before
    public  void setUp() {
        integerInversion = new IntegerInversion();
        timer = new Timer();
    }

    @Test
    public void reverse() {
        int random = new Random().nextInt(10000);
        timer.startTime();
        System.out.println(random+"反转之后："+integerInversion.reverse(random));
        System.out.println(timer.getTime(2));

    }
}