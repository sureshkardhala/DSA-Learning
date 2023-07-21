

public class BinarySearch {
    public static int binarySearch(int[] nums, int target, int l, int r){
        //Recursive approach
        if(r>=l){
            int mid = l+ (r-l)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) return binarySearch(nums, target, l, mid-1);
            return binarySearch(nums, target, mid+1, r);
        }
        return -1;

        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]==target) return mid;
        //     if(nums[mid] < target) l=mid+1;
        //     else r=mid-1;
        // }
        // return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        return binarySearch(nums, target, l, r);
    }
}
