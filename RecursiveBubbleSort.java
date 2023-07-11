import java.util.*;
public class RecursiveBubbleSort {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void bSort(int []arr, int n){
        for(int i=n-2; i>=0; i--){
            boolean didSwap = false;
            for(int j=0; j<=i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }
    }
    
    
    
    public static void recursiveBSort(int[] arr, int n){
        if(n==1) return;
        boolean didSwap = false;
        for(int i=0; i<=n-2 ; i++){
            if(arr[i]>arr[i+1]){
                swap(arr, i, i+1);
                didSwap = true;
            }
        }
        if(!didSwap) return;
        recursiveBSort(arr, n-1);
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
        recursiveBSort(arr, n);
        print(arr);
    }

}
