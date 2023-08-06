package Strings.Easy;

public class PatternMatchingNaive {
    public static void main(String[] args) {
        String text="ABCDABC";
        String pattern ="ABC";
        int n = text.length();
        int m = pattern.length();
        // for(int i=0; i<n-m+1; i++){
        //     int j=i;
        //     int count=0;
        //     for(int k=0; k<m&&j<n; k++){
        //         if(text.charAt(j)!=pattern.charAt(k)){
        //             break;
        //         }
        //         j++;
        //         count++;
        //     }
        //     if(count==m){
        //         System.out.print(i+" ");
        //     }
        // }
        for(int i=0; i<n-m+1; i++){
            int j=0;
            for(j=0; j<m; j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }
    }
}
