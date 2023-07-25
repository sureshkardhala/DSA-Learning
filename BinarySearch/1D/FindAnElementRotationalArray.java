public class FindAnElementRotationalArray {
    public static int binarySearch(int[] nums, int low, int high, int target){
        if(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                return binarySearch(nums, low, mid-1, target);
            } else{
                return binarySearch(nums, mid+1, high, target);
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums, int n)
    {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid < high && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > low && nums[mid - 1] > nums[mid])
                return mid - 1;
            if (nums[low] > nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
 

    public int search(int[] nums, int target) {
        int res=-1;
        int pivot = findPivot(nums, nums.length)+1;
        if(pivot ==0){
            return binarySearch(nums, 0, nums.length-1, target);
        }
        else if(nums[0] > target){
            res=binarySearch(nums, pivot, nums.length-1, target);
        }
        else if(nums[0]==target){
            res=0;
        }
        else{
            res=binarySearch(nums, 0,pivot-1, target);
        }
        return res;
    }
}