import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean isPrime = false;
        for(int i=2; i<n; i++){
            if(n%i ==0){
                isPrime = true;
            }
        }
        if(!isPrime){
            System.out.println("Prime Number");
        } else{
            System.out.println("Not a prime number");
        }
    }
}
