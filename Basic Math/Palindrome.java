import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nuumber");
        int n = sc.nextInt();
        int num = n;
        int digit=0;
        while(n>0){
            int rem = n%10;
            digit=digit*10+rem;
            n=n/10;
        }
        if(digit == num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palindrome");
        }
    }
}
