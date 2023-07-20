package Arrays.Medium;

import java.util.HashSet;

public class LongestSequence {
     public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n=a.length;
        if(n==0) return 0;
        int longest =1;
        HashSet<Integer> set = new HashSet<>();
        for(int e : a){
            set.add(e);
        }
        for(Integer it : set){
            int count=1;
            Integer x=it;
            while(set.contains(x+1)){
                x=x+1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
