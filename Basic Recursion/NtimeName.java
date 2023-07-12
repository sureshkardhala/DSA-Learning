import java.util.Scanner;

public class NtimeName {

    public void print(int i, int n) {
        if (i > n)
            return;
        System.out.println("Suresh Kardhala");
        i++;
        print(i, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        NtimeName hw = new NtimeName();
        hw.print(1, n);
    }

}
