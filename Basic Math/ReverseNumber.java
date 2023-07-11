import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nuumber");
        int n = sc.nextInt();
        int digit=0;
        while(n>0){
            int rem = n%10;
            digit=digit*10+rem;
            n=n/10;
        }
        System.out.println(digit);
    }
}
