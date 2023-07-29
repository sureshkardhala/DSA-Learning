

public class MaximumOnesRow {
    public static int findSum(ArrayList<Integer> arr){
        int sum=0;
        for(Integer a : arr){
            sum+=a;
        }
        return sum;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int ans=-1, sum=-1;
        for(int i=0; i<n; i++){
            int sum1 = findSum(matrix.get(i));
            if(sum1>sum){
                ans=i;
                sum=sum1;
            }
        }
        return ans;
    }
}
