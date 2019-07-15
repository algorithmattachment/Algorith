package com.hsj;

/**
 * 反转整数
 * @author 黄仕杰
 * @date 2019/07/14
 */
public class IntegerInversion {
    /**
     * @param x 要反转的整数
     * @return
     */
    public int reverse(int x)
    {
        int result = 0;
        while(x != 0)
        {
            int num = x%10;
            int res = result*10 + num;
            if((res-num)/10 != result){
                return 0;
            }
            result = res;
            x = x/10;
        }
        return result;

    }
}
