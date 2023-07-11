import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number");
            int n = sc.nextInt();
            boolean isPrime = false;
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    isPrime=true;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}
