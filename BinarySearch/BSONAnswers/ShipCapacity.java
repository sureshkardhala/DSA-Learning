package BinarySearch.BSONAnswers;

public class ShipCapacity {
    public static int findDays(int[] weights, int n, int cap){
        int load=0,days=1;
        for(int i=0; i<n;i++){
            if(load+weights[i]<=cap){
                load+=weights[i];
            }else{
                load=weights[i];
                days++;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;
        int n=weights.length;
        for(int i=0; i<n; i++){
            high+=weights[i];
            low=Math.max(low, weights[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int daysT=findDays(weights, n, mid);
            if(daysT<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
