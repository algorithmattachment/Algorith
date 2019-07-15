package com.tool.timer;

import com.tool.timer.TimerInterface;


/**
 * @author 黄仕杰
 * @date 2019/07/01
 */
public class Timer implements TimerInterface {
    /**
     * 开始计时的时候的系统时间，单位纳秒
     */
    private long start;
    /**
     * 被计时程序的运行时间
     */
    private long time;

    /**l
     * 枚举类型，时间单位
     */
    public enum TimeType{
        /**
         * 时间类型 MS：毫秒 SUBTLE 微妙
         */
        MS(1), SUBTLE(2);

        private int type;


        TimeType(int type){
            this.type= type;
        }

        public int getType(){
            return type;
        }

    }
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
        if (type != TimeType.MS.getType() && type != TimeType.SUBTLE.getType()) {
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
