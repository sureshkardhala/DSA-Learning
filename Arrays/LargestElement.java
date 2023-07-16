package Arrays;

import java.util.Scanner;

public class LargestElement {

    public static int findLargestElement(int [] arr, int n){
        int largestElement = arr[0];
        for(int i=0; i<n; i++){
            if(largestElement < arr[i]){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int [] arr = new int[5];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            System.out.print(findLargestElement(arr, n));
        }
    }
}
