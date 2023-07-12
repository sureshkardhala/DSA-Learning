import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String str = n+"";
        int length = str.length();
        double sum =0, newNum=n;
        while(n!=0){
            int rem = n %10;
            sum=sum+ Math.pow(rem,length);
            n=n/10;
        }
        if(sum==newNum){
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not Armstrong Number");
        }
    }
}
