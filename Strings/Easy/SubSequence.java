package Strings.Easy;

public class SubSequence {
    public static void main(String[] args) {
        String s1="ABCDEF";
        String s2="AD";
        int m=s2.length();
        int j=0;
        for(int i=0; i<s1.length()&j<m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        if(j==m){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
