import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {
    public int[] intersection(int[] arr1,int[] arr2){
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        //存入map，统计出现次数
        for (int num:arr1){
            if(map1.containsKey(num))
                map1.put(num,map1.get(num)+1);
            else
                map1.put(num,1);
        }
        for (int num:arr2){
            if (map2.containsKey(num))
                map2.put(num,map2.get(num)+1);
            else
                map2.put(num,1);
        }
        ArrayList<Integer> tem = new ArrayList<>();     //临时存放结果
        //计算交集
        for (Integer num:map1.keySet()){
            if (map2.containsKey(num)){
                if (map1.get(num)!=1&&map2.get(num)!=1){
                    int i = map1.get(num)< map2.get(num)?map1.get(num):map2.get(num);
                    for (;i>0;i--)
                        tem.add(num);
                    }
                else tem.add(num);
            }
        }
        int[] res = new int[tem.size()];
        for (int i =0;i<tem.size();i++){
            res[i] = tem.get(i);
        }
        return res;
    }
}
