import java.util.Scanner;

class GCDOfNumbers{


    public static int GCD(int n1, int n2){
        if(n1==0){
            return n2;
        } 
        if(n2==0){
            return n1;
        }
        if(n1<n2){
            return GCD(n1, n2-n1);
        } return GCD(n1-n2, n2);
    }
    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1= sc.nextInt();
        System.out.println("Enter number 2");
        int n2= sc.nextInt();

        int res = GCD(n1, n2);
        System.out.println("GCD of "+n1 + " and " + n2 + " is : " + res);
    }
}