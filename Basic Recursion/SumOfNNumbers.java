import java.util.Scanner;

public class SumOfNNumbers {
    public int print(int n){
        if(n==0) return 0;
        return n + print(n=n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        SumOfNNumbers on = new SumOfNNumbers();
        int x = on.print(n);
        System.out.println(x);
    }
}
