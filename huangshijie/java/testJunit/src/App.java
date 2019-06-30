
import java.util.Iterator;

import java.util.TreeSet;

/**
 * @author 黄仕杰
 * @date 2019/06/29
 */
public class App {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i=0;
        for (int n : set) {
            nums[i] = n;
            i++;
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+",");
        }
        return set.size();
    }


}
