package SF;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public int[] intersection(int[] num1, int num2) {
        Set<Integer> arr1 = new HashSet<Integer>();
        Set<Integer> arr2 = new HashSet<Integer>();
        //将数组元素存放到Set中，顺便去掉重复元素
        for (Integer num : num1)
            arr1.add(num);
        for (Integer num : arr2)
            arr2.add(num);
        //两集合交集
        arr1.retainAll(arr2);
        //遍历交集，转移结果
        int[] res = new int[arr1.size()];
        int index = 0;
        for (int num : arr1) {
            res[index] = num;
            index++;
        }
        return res;
    }
}