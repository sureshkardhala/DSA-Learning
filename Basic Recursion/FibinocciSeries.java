import java.util.Scanner;

public class FibinocciSeries {
    public int recursiveFibnocci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return recursiveFibnocci(n-1) + recursiveFibnocci(n-2);
    }

    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int n1=0, n2=1;
        int sum=0;
        while(n>1){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            n--;
        }
        return n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        FibinocciSeries fb = new FibinocciSeries();
        System.out.println(fb.recursiveFibnocci(n));
        System.out.println(fb.fib(n));

    }
}
