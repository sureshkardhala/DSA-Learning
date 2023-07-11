import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void recursiveISort(int [] arr, int n){
        if(n == 1) return ;
        int i= arr.length - n +1;
        for(int j=0; j<=i; j++){
            if(arr[j]>arr[i]){
                swap(arr, j, i);
            }
        }
        recursiveISort(arr, n-1);
    }
    public static void print(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements into array: ");
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        // bSort(arr, n);
        // recursiveBSort(arr, n);
        // iSort(arr, n);
        recursiveISort(arr, n);
        print(arr);
    }
    
}
