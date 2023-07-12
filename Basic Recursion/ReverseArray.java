import java.util.Scanner;

public class ReverseArray {

    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter numbers into array");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n/2; i++){
            swap(arr,i, n-i-1);
        }
        for(int i=0; i<n; i++) System.out.print(arr[i]+ " ");
    }
}
