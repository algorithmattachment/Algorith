package SF;

import java.util.Set;
import java.util.TreeSet;
/**
 * @author 刘毅
 * @date 2019/7/6 22:41
 */
public class ArrayIntersection {
    public static int[] intersection(int[] arr1,int[] arr2){
        Set tem = new TreeSet();
        for (int el:arr1){
            for (int num:arr2){
                if(el==num)
                    tem.add(el);
            }
        }
        Object[] snap = tem.toArray();
        int[] res = new int[snap.length];
        for (int i=0;i<snap.length;i++){
            res[i] = (int)snap[i];
        }
        return res;
    }
}
