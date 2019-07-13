public class MobileZero {
    public void moveZero(int[] nums){
        int count = 0;              //记录非0出现的次数，确定补0下标
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[count] = nums[i];      //将非0的位置与0的位置交换
                count++;                    //相应的非0 数出现次数+1，出现0 的下标后移
            }
        }
        for (int j = count;j<nums.length;j++){
            nums[j] = 0;                    //在非0位置后补充0；count为记录下标
        }
    }
}
