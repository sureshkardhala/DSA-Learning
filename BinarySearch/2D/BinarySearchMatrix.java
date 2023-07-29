
public class BinarySearchMatrix {
    class Solution {
        // public static boolean findElement(int []a, int target){
        //     int low=0,high=a.length-1;
        //     while(low<=high){
        //         int mid =(low+high)/2;
        //         if(a[mid]==target){
        //             return true;
        //         }else if(a[mid] < target){
        //             low=mid+1;
        //         }else{
        //             high=mid-1;
        //         }
        //     }
        //     return false;
        // }
        public boolean searchMatrix(int[][] matrix, int target) {
            
            // for(int i=0; i<matrix.length; i++){
            //     if(findElement(matrix[i], target)){
            //         return true;
            //     }
            // }
            // return false;
            int lo = 0;
            if(matrix.length == 0) return false;
            int n = matrix.length; 
            int m = matrix[0].length; 
            int hi = (n * m) - 1;
            
            while(lo <= hi) {
                int mid = (lo + (hi - lo) / 2);
                if(matrix[mid/m][mid % m] == target) {
                    return true;
                }
                if(matrix[mid/m][mid % m] < target) {
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
            return false;
        }
    } 
}
