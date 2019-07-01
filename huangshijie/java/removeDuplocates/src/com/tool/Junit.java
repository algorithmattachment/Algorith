package com.tool;

import java.util.Random;

/**
 * @author 黄仕杰
 * @date 2019/07/01
 */
public class Junit {

    /**
     * @return 返回相对精确的计时
     */
    public static long getTime() {
        return System.nanoTime();
    }

    /**
     * @return 返回当前虚拟机可用空间
     */
    public static long getMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    /**
     * @param n 返回数组的大小
     * @param max 生长数组中书的范围
     * @return 测试数组
     */
    public static int[] getTestData(int n,int max) {
        int[] test = new int[n];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            test[i] = random.nextInt(max);
        }
        return test;
    }

}

