package Strings.Medium;

public class FindingLPS {
    public static int noOfCommonPrefixAndSuffix(String str, int n){
        for(int len=n-1; len>0; len--){
            boolean flag=true;
            for(int i=0;i<len; i++){
                if(str.charAt(i)!=str.charAt(i-len+n)){
                    flag=false;
                }
            }
            if(flag){
                return len;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str="ababc";
        int n=str.length();
        int[]arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=noOfCommonPrefixAndSuffix(str, i+1);
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
