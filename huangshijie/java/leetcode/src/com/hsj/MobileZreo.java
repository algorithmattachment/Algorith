package com.hsj;

/**
 * @author 黄仕杰
 * @date 2019/07/05
 */
public class MobileZreo {
    /**
     * 第六天，移动零
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

}
