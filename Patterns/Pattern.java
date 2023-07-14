package Patterns;

import java.util.Scanner;

public class Pattern {
     public static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
     public static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


     public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
     public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
        
    }
     public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        
    }

    public static void pattern7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void pattern8(int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern9(int n){
        pattern6(n);
        pattern7(n);
    }

    public static void pattern10(int n){
        pattern2(n);
        pattern3(n-1);
    }

    public static void pattern11(int n ){
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1 + " ");
                } else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void pattern12(int n){
        int space = 2*(n-1);
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=space; j++ ){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            space-=2;
             System.out.println(" ");
        }

        
       
    }

    private static void pattern13(int n) {
         int space = 1;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(space+" ");
                space++;
            }
             System.out.println(" ");
        }
    }

    private static void pattern14(int n) {
        for(int i=1; i<=n; i++){
            int charVal =65;
            for(int j=1; j<=i; j++){
                System.out.print((char)charVal+" ");
                charVal++;
            }
            System.out.println(" ");
        }
    }

     private static void pattern15(int n) {
        for(int i=n; i>=1; i--){
            int charVal =65;
            for(int j=1; j<=i; j++){
                System.out.print((char)charVal+" ");
                charVal++;
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            pattern16(n);
        }
    }
    
   
    
    
}
