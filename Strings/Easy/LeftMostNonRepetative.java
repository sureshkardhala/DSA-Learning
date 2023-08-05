package Strings.Easy;

import java.util.Arrays;

public class LeftMostNonRepetative {
     public static final int CHAR_SIZE=256;
    public static int LNC(String str){
        int fi[] = new int[CHAR_SIZE];
        Arrays.fill(fi, -1);
        for(int i=0;i<str.length(); i++){
            if(fi[str.charAt(i)] ==-1){
                fi[str.charAt(i)]=i;
            }else{
                fi[str.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0; i<CHAR_SIZE;i++){
            if(fi[i]>=0){
                res=Math.min(res, fi[i]);
            }
        }
        return res==Integer.MAX_VALUE ? -1 : res;
    }
    public static void main(String[] args) {
        String str= "geeksforgeeks";
        System.out.println(LNC(str));
    }
}
