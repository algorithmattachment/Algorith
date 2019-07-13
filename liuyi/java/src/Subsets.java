import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<>());
        for (int num : nums) {                                      // 遍历所有元素
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i));  // 逐一取出中间结果集
                temp.add(num);                                      // 将 num 放入中间结果集
                res.add(temp);                                      // 加入到结果集中
            }
        }
        return res;
    }
}
