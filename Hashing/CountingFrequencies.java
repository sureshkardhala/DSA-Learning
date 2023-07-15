package Hashing;

public class CountingFrequencies {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,6,6,6,6,7,8,9,0};
        int [] hMap = new int [arr.length+1];
        for(int i=0;i<arr.length; i++){
            hMap[arr[i]]+=1;
        }
        for(int x=0; x<hMap.length; x++){
            System.out.println(x+" : " + hMap[x]);
        }
    }
}
