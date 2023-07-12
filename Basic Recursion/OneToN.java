import java.util.Scanner;

public class OneToN {

    public void print(int i, int n){
        if(i>n) return;
        System.out.print(i+ " ");
        i++;
        print(i, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        OneToN on = new OneToN();
        on.print(1,n);
    }
}
