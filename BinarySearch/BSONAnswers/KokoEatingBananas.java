package BinarySearch.BSONAnswers;

public class KokoEatingBananas{
    class Solution {
        public static int findMaxVal(int piles[]){
            int maxVal = Integer.MIN_VALUE;
            for(int i=0; i<piles.length; i++){
                maxVal=Math.max(piles[i], maxVal);
            }
            return maxVal;
        }
        public static int hoursConsume(int[] piles, int k){
            int res=0;
            for(int i=0; i<piles.length; i++){
                res+=Math.ceil((double)piles[i]/(double)k);
            }
            return res;
        }
    
        public int minEatingSpeed(int[] piles, int h) {
            int low=1,high=findMaxVal(piles);
            while(low<=high){
                int mid = low +(high-low)/2;
                int totalH= hoursConsume(piles, mid);
                if(totalH <=h){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            return low;
        }
    }
    public static void main(String[] args) {
        
    }
}