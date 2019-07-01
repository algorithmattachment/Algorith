package com.tool.timer;

/**
 * @author 黄仕杰
 * @date 2019/07/01
 */
public interface TimerInterface {
    /**
     * 开始计时
     *
     * @return long
     */
    long startTime();

    /**
     * 停止计时
     *
     * @return long
     */
    long stopTime();

    /**
     * 获取时间
     * @param  type 获取的时间类型（1:秒，2:毫秒，3微秒）
     * @return double
     */
    double getTime(int type);

    /**
     * 获取时间
     *
     * @return double
     */
    double getTime();
}

