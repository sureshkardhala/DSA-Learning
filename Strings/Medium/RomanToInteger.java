package Strings.Medium;

public class RomanToInteger {
    public int romanToInt(String s) {
        int num=0, ans=0,prev=0;
        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            //Approach 1:
            // if (4*num < ans) ans-=num;
            // else ans+=num;

            //Approach 2:
           if(num>=prev){
               ans+=num;
           }else{
               ans-=num;
           }
           prev=num;
        }
        return ans;
}
