import java.util.Scanner;

public class BubbleSort {

    public static void sort(int []arr, int n){
        for(int i=n-1; i>=0; i--){
            int bSort =0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    bSort=1;
                }
            }
            if(bSort == 0){
                break;
            }
        }

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        sort(arr,n);
        for(int i=0; i<n;i++) System.out.println(arr[i]);
    }
    
}
