package Arrays.Easy;

public class LongestSubArray {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int i=0, j=0;
        long sum=a[i];
        int count=0;
        while(i<a.length){
           while(sum >k && j<=i){
               sum-=a[j];
               j++;
           }
           if(sum==k){
               count=Math.max(count, i-j+1);
           }
           i++;
           if(i<a.length) sum+=a[i];
        }
        return count;
    }
}
