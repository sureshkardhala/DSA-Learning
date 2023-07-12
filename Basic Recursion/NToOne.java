import java.util.Scanner;

public class NToOne {
    public void print(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        n--;
        print(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        NToOne on = new NToOne();
        on.print(n);
    }
}
