package com.hsj;

import com.sun.imageio.spi.RAFImageInputStreamSpi;
import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;

public class PublicPrefixTest {
    private PublicPrefix publicPrefix;
    private Timer time;
    @Before
    public void setUp() {
        publicPrefix = new PublicPrefix();
        time = new Timer();
    }

    @Test
    public void test_longestCommonPrefix() {
        time.startTime();
        String[] str = {"sdads", "sdsds", "sdhello"};
        System.out.println(publicPrefix.longestCommonPrefix(str));
        System.out.println(time.getTime(2));

    }
}