package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;

import Hashing.hMap.EntrySet;

import java.util.Scanner;

public class FindingHighestFrequencyAndLowestFrequencyElement {
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

        int lowFreq=hMap.get(arr[0]),highFreq=hMap.get(arr[0]),hElement=arr[0],lowElement=arr[0];
        for(Entry<Integer, Integer> e: hMap.entrySet()){
            if(lowFreq > e.getKey()){
                lowFreq=e.getValue();
                lowElement=e.getKey();
            }
            if(highFreq<e.getKey()){
                highFreq=e.getKey();
                hElement=e.getValue();
            }
        }
        System.out.println(lowElement + " : " +  lowFreq);
        System.out.println(hElement  + " : " + highFreq);
    }
}
