package com.hsj;

import org.junit.Before;
import org.junit.Test;
import sun.security.provider.certpath.PKIXTimestampParameters;

import javax.sound.midi.Soundbank;
import java.util.Random;

import static org.junit.Assert.*;

public class ArraysIntersectionTest {
    private ArraysIntersection arraysIntersection;
    @Before
    public void setUp() {
        arraysIntersection = new ArraysIntersection();
    }

    @Test
    public void test_intersection() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        Random random = new Random(System.currentTimeMillis());
        int[] a =new int[10000000];
        int[] b =new int[10000000];
        for (int j = 0; j < a.length; j++) {
            a[j] = random.nextInt(10000);
            b[j] = random.nextInt(10000);
        }
        long star = runtime.freeMemory();
        long time = System.nanoTime();
        arraysIntersection.intersection(a, b);
        System.out.println((System.nanoTime()-time)/1000000000);
        long end = runtime.freeMemory();
        System.out.println(end);
        System.out.println((star-end)/(1024*1024));
    }
}