import java.util.Scanner;

public class FactorialOfNumber {
     public int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n=n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        FactorialOfNumber on = new FactorialOfNumber();
        int x = on.factorial(n);
        System.out.println(x);
    }
}
