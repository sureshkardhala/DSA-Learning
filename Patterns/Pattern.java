package Patterns;

import java.util.Scanner;

import javax.swing.text.Style;

public class Pattern {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void pattern8(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern9(int n) {
        pattern6(n);
        pattern7(n);
    }

    public static void pattern10(int n) {
        pattern2(n);
        pattern3(n - 1);
    }

    public static void pattern11(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            space -= 2;
            System.out.println(" ");
        }

    }

    private static void pattern13(int n) {
        int space = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(space + " ");
                space++;
            }
            System.out.println(" ");
        }
    }

    private static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            int charVal = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) charVal + " ");
                charVal++;
            }
            System.out.println(" ");
        }
    }

    private static void pattern15(int n) {
        for (int i = n; i >= 1; i--) {
            int charVal = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) charVal + " ");
                charVal++;
            }
            System.out.println(" ");
        }
    }

    private static void pattern16(int n) {
        int charVal = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) charVal + " ");
            }
            charVal++;
            System.out.println(" ");
        }
    }

    private static void pattern17(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j = 1; j <=2 * i + 1; j++) {
                System.out.print(ch);
                if(j<=breakPoint) ch++;
                else ch--;
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }

    private static void pattern18(int n) {
        
        for(int i=0; i<n; i++){
            char ch='A';
            ch+=n-i-1;
            for(int j=0; j<=i; j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println(" ");
        }
    }

    private static void pattern19(int n) {
        int inis=0;
        int inis1=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0; j<inis; j++){
                System.out.print("  ");
            }
            inis+=2;
             for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
            inis1=inis-2;
        }
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0; j<inis1; j++){
                System.out.print("  ");
            }
            inis1-=2;
             for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }


    private static void pattern20(int n) {
        int inis=2*n-2;
        int inis1=0;
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0; j<inis; j++){
                System.out.print("  ");
            }
            inis-=2;
             for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
         for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0; j<inis1; j++){
                System.out.print("  ");
            }
            inis1+=2;
             for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }







      private static void pattern21(int n) {
        for(int i=0; i<n ;i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 ||  j==0 || j==n-1) System.out.print("*"+" ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }





     private static void pattern22(int n) {
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top=i;
                int left=j;
                int right =2*(n-1)-j;
                int down =2*(n-1)-i;
                System.out.print(n-Math.min(Math.min(top,down), Math.min(right, left)));
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            pattern22(n);
        }
    }

   

  

    

    

    

}
