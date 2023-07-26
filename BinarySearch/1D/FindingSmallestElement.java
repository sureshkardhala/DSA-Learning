public class FindingSmallestElement {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int pivot=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid < high && nums[mid] > nums[mid+1]){
                pivot=mid;
                break;
            }
            if(low < mid && nums[mid-1] > nums[mid]){
                pivot=mid-1;
                break;
            }
            if(nums[low] < nums[mid]){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return nums[pivot+1];

        //Another Approach
        // int ans = Integer.MAX_VALUE;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(nums[low] <= nums[high]){
        //         ans = Math.min(ans, nums[low]);
        //         break;
        //     }
        //     if(nums[low] <= nums[mid]){
        //         ans=Math.min(ans, nums[low]);
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //         ans = Math.min(ans, nums[mid]);
        //     }
        // }
        // return ans;
    }
}
