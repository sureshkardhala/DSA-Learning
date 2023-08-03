package Arrays.Hard;

public class FindRowsInPascalTraingle {
    public static void printRow(int n){
        int res=1;
        System.out.print(res+" ");
        for(int i=1; i<n; i++){
            res=res*(n-i);
            res=res/i;
            System.out.print(res+" ");
        }
    }
}
