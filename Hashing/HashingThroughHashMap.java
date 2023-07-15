package Hashing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class HashingThroughHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n= sc.nextInt();
        Integer [] arr = new Integer[n];
        HashMap<Integer, Integer> hMap = new HashMap<>();
        System.out.println("Enter the elements of an array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("Enter number of queries : ");
        int q= sc.nextInt();
        while(q>0){
            Integer x = sc.nextInt();
            System.out.println(" Count of "+ x +" is : " + hMap.getOrDefault(x, 0) );
            q--;
        }

        for(Entry<Integer, Integer> a: hMap.entrySet()){
            System.out.println(a.getKey() + " : " + a.getValue());
        }
    }
}
