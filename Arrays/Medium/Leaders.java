package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Leaders {
     public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> res = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=a.length-1; i>=0;i--){
            if(a[i] > max){
                max=a[i];
                res.add(a[i]);
            }
        }
        return res;
    }
}
