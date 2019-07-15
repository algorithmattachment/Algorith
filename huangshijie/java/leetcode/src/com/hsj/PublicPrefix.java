package com.hsj;

/**
 * 第十天——公共前缀
 * @author 黄仕杰
 * @date 2019/07/08
 */
public class PublicPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int min = 0;
        for(int i=1;i<strs.length;i++){
            if(strs[min].length()>strs[i].length()){
                min = i;
            }
        }
        boolean b = false;
        int end = -1;
        for (int i=0;i<strs[min].length()&&b==false;i++) {
            for (String str : strs) {
                if (strs[min].charAt(i) != str.charAt(i)) {
                    end = i-1;
                    b=true;
                    break;
                }
            }

        }
        if (!b) {
            return strs[min];
        }
        return end == -1 ? "" : strs[min].substring(0, end+1);
    }
}
