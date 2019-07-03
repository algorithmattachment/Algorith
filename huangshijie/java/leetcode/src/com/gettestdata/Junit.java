package com.gettestdata;

import java.util.Random;

/**
 * 在这个里里面放一些是生成测试数据的方法
 * @author 黄仕杰
 * @date 2019/07/01
 */
public class Junit {



    /**
     * @param length 返回数组的大小
     * @param max 生长数组中书的范围
     * @return 测试数组
     */
    public static int[] getTestData(int length,int max) {
        int[] test = new int[length];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
            test[i] = random.nextInt(max);
        }
        return test;
    }

    /**
     * 获取随机测试括号字符串
     * @param num 字符串长度
     * @return String
     */
    public static String getString(int num) {
        String[] sirs = {"{", "}", "[", "]", "(", ")"};
        int[] number = getTestData(num, sirs.length);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : number) {
            stringBuilder.append(sirs[i]);
        }
        return stringBuilder.toString();
    }

}

