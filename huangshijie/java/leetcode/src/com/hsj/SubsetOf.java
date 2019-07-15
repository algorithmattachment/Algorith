package com.hsj;

import com.tool.timer.Timer;

import java.util.ArrayList;

import java.util.List;

/**
 * @author 黄仕杰
 * @date 2019/07/07
 */
public class SubsetOf {
    /**
     * 第八天——子集
     * @param nums 需要求子集的数组
     * @return 返回包含nums所有子集的集合
     */
    public  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();

        dfs(result,temp,nums,0);

        return result;
    }

    /**
     * 深度优先
     * @param result 所有的子集
     * @param temp 临时存放的子集
     * @param nums 求有多少子集的数组
     * @param j 子原有子集的基础上添加元素是位移的个数
     */
    public static void dfs(List<List<Integer>> result, List<Integer> temp, int[] nums, int j){

        result.add(new ArrayList<Integer>(temp));

        for (int i = j; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(result,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }

    }

}
