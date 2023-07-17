package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0, min=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                max++;
            }
            else {
                if(min<max){
                     min=max;
                }
                max=0;
            }
        }
        if(min<max){
            min=max;
        }
        return min;
    }
}
