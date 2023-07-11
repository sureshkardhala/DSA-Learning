import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nuumber");
        int n = sc.nextInt();
        //Approach1
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);

        //Approach2
        System.out.print("Enter Nuumber");
        int n1 = sc.nextInt();
        String str = n1+"";
        System.out.println(str.length());
    }
}
