package Arrays.Medium;

public class MaxSumSubArray {
    public static void maxSumArray(int []nums){
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int start=0, end=0;
        for(int i=0; i<nums.length; i++){
            if(sum == 0){
                start=i;
            }
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
                end=i;
            }
            if(sum <0) sum=0;
        }
        for(int i=start; i<=end; i++){
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String[] args) {
       int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
       maxSumArray(nums);
    }
}
