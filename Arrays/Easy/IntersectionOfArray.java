package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class IntersectionOfArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        TreeSet<Integer> ts = new TreeSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            ts.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            ts.add(b[i]);
        }
        for(Integer e : ts){
            l.add(e);
        }
        return l;
    }
}
