package Strings.Easy;

public class PatternMatchingNavieForDistinct {
    public static void main(String[] args) {
        String text="ABCABCD";
        String pattern ="ABCD";
        int n = text.length();
        int m = pattern.length();
        for(int i=0; i<n-m+1;){
            int j=0;
            for(j=0; j<m; j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
                break;
            }else{
                i=i+j;
            }
        }
    }
}
