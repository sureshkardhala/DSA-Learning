public class NextPermutation {
    public static void reverse(int []nums, int left, int right){
        while(left <right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums){
        int index=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1) reverse(nums, 0, nums.length-1);
        else{
            for(int i=nums.length-1; i>=0; i--){
                if(nums[index] < nums[i]){
                    swap(nums, i,index);
                    break;
                }
            }
            reverse(nums, index+1, nums.length-1);
        }
    }
}
