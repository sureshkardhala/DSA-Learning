import java.util.*;

public class GcdORHcf {
    static int gcd(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nuumbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //BruteForce Method
        int max =1;
        for(int i=2; i<= Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                max=i;
            }
        }
        System.out.println(max);


        //Optimal Approach
        //Euclidian Algorithm gcd(a,b) = gcd(b, a%b);

        System.out.print("Enter Nuumbers");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        System.out.println(gcd(n3,n4));
    }
}
