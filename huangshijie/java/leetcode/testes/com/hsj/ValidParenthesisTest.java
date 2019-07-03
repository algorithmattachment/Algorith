package com.hsj;

import com.gettestdata.Junit;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisTest {
    private ValidParenthesis validParenthesis;
    private Timer timerJunit;

    @Before
    public void setUp() {
        validParenthesis = new ValidParenthesis();
        timerJunit = new Timer();
    }

    @Test
    public void test_isValid() {
        timerJunit.startTime();
        System.out.println(validParenthesis.isValid(Junit.getString(2)));
        System.out.println(timerJunit.getTime());
    }
}