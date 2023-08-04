package Strings.Easy;

public class LargestOddNumber {
    public String largestOddNumber(String num) {
        int i= num.length()-1;
        while(i>=0){
            int n = num.charAt(i);
            if(n%2!=0){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}
