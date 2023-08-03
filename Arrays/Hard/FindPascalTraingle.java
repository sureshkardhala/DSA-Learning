package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class FindPascalTraingle {
    public static List<Integer> findRow(int n){
        int ans=1;
        List<Integer>res= new ArrayList<>();
        res.add(ans);
        for(int i=1; i<n; i++){
            ans=ans*(n-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>resList = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            resList.add(findRow(i));
        }
        return resList;
    }
}
