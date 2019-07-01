package com.tool;

import com.tool.timer.TimerInterface;


/**
 * @author 黄仕杰
 * @date 2019/07/01
 *
 */
public class TimerJunit implements TimerInterface {
    private long start;
    private long time;
    /**
     * 开始计时
     *
     * @return long
     */
    @Override
    public long startTime() {
        start=System.nanoTime();
        return start;
    }

    /**
     * 停止计时
     *
     * @return long
     */
    @Override
    public long stopTime() {
        time = System.nanoTime() - start;
        start = 0;
        return time;
    }

    /**
     * 获取时间
     *
     * @param  type 获取的时间类型（1:毫秒，2:微秒）
     * @return double
     */
    @Override
    public double getTime(int type) {
        if (time == 0) {
            stopTime();
        }
        if (type != 1 && type != 2) {
            type = 1;
        }
        return type==1?time/1000000.0:time/1000.0;
    }

    /**
     * 获取时间
     *
     * @return double
     */
    @Override
    public double getTime() {
        if (time == 0) {
            stopTime();
        }
        return time / 1000000000.0;
    }

}
