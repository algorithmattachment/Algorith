package com.hsj;

/**
 * 第四天 打家劫舍
 * @author 黄仕杰
 * @date 2019/07/03
 */
public class AlShabaab {
    /**
     * 第四天打家劫舍
     * 动态规划
     * @param nums
     * @return int
     */
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int satr=nums[0],netx=Math.max(satr,nums[1]);
        for (int i=2;i<nums.length;i++){
            int temp=netx;
            netx=Math.max(netx,satr+nums[i]);
            satr=temp;
        }
        return netx;
    }
}
