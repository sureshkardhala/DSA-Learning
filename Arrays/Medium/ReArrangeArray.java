package Arrays.Medium;

public class ReArrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int positiveIndex=0,negitiveIndex=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                res[negitiveIndex] = nums[i];
                negitiveIndex+=2;
            } else{
                res[positiveIndex] = nums[i];
                positiveIndex+=2;
            }
        }
        return res;
    }
}
