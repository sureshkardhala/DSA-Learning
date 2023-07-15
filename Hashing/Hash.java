package Hashing;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int [] arr= new int [n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            //prestoring into hash
            int [] hash = new int[n+1];
            for(int i=0; i<n; i++) hash[arr[i]]+=1;

            //Number of queries
            System.out.println("Enter no of queries");
            int q= sc.nextInt();
            while(q>0){
                int x = sc.nextInt();
                System.out.println("Count of "+ x +" is :" +hash[x]);
                q--;
            }
        }
    }
}
