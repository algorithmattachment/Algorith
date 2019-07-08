package SF;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public int[] intersection(int[] num1, int num2) {
        Set<Integer> arr1 = new HashSet<Integer>();
        Set<Integer> arr2 = new HashSet<Integer>();

        for (Integer num : num1)
            arr1.add(num);
        for (Integer num : arr2)
            arr2.add(num);

        arr1.retainAll(arr2);
        int[] res = new int[arr1.size()];
        int index = 0;
        for (int num : arr1) {
            res[index] = num;
            index++;
        }
        return res;
    }
}