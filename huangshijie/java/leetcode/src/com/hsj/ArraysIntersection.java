package com.hsj;

import java.util.TreeSet;

/**
 * @author 黄仕杰
 * @date 2019/06/30
 */
public class ArraysIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> setnums = new TreeSet<>();
        for (int num:nums1){
            set.add(num);
        }
        for (int num2:nums2){
            if (set.contains(num2)){
                setnums.add(num2);
            }
        }
        int [] nums=new int[setnums.size()];
        int i=0;
        for (Integer setnum:setnums){
            nums[i]=setnum;
            i++;
        }
        return nums;
    }

}


