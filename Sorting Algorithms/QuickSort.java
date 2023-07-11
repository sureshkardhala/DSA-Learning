import java.util.Scanner;

public class QuickSort {
    public static void swap(int[]arr,int i, int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int getPivot(int []arr, int low, int high){
        int pivot = arr[low];
        int i=low, j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr, i,j);
            }
        }
        swap(arr, low,j);
        return j;
        
    }
    public static void sort(int []arr,int low, int high){
        if(low<high){
            int pivot = getPivot(arr, low, high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        sort(arr,0,n-1);
        for(int i=0; i<n;i++) System.out.println(arr[i]);
    }
    
}
