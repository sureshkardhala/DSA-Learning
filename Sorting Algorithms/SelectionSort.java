import java.util.Scanner;

public class SelectionSort {
    public static void sort(int []arr,int n){
        for(int i=0; i<=n-2; i++){
            int min_index = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j]<arr[i]){
                    min_index=j;
                }
            }
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        sort(arr,n);
        for(int i=0; i<n;i++) System.out.println(arr[i]);
    }

    
}
