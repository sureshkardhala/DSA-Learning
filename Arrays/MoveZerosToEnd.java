package Arrays;

public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int [] a= new int [nums.length];
        int x =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                a[x]=nums[i];
                x++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=a[i];
        }
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]!=0){
        //         int temp=nums[i];
        //         nums[i]=nums[x];
        //         nums[x]=temp;
        //         x++;
        //     }
        // }
        
    }
}
