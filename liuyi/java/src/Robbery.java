public class Robbery {
    public int rob(int[] nums){
        int sum1 = 0;                           //存放偶数房号金额比较大小
        int sum2 = 0;                           //存放奇数房号金额比较大小
        for (int i = 0;i<nums.length;i++){
            if (i%2==0){                        //如果是偶数,比较前后大小
                sum1 += nums[i];
                sum1 = sum1>sum2?sum1:sum2;
            }
            else{
                sum2 += nums[i];
                sum2 = sum1>sum2?sum1:sum2;
            }
        }
        int res = sum1>sum2?sum1:sum2;          //获取较大值
        return res;
    }
}
