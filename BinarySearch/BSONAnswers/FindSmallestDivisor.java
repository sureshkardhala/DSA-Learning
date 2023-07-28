package BinarySearch.BSONAnswers;

public class FindSmallestDivisor {
    class Solution {
        public static int findMax(int[] nums){
            int maxVal = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                maxVal=Math.max(maxVal, nums[i]);
            }
            return maxVal;
        }
        public static int sumOfDivisors(int []nums, int k){
            int res=0;
            for(int i=0; i<nums.length; i++){
                res+=Math.ceil((double)nums[i]/(double)k);
            }
            return res;
        }
        public int smallestDivisor(int[] nums, int threshold) {
            int low=1, high=findMax(nums);
            while(low<=high){
                int mid =(low+high)/2;
                int val = sumOfDivisors(nums, mid);
                if(val <= threshold){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return low;
        }
    }
}
