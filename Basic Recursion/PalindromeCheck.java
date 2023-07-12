import java.util.Scanner;

public class PalindromeCheck {
    public boolean  palindrome(String s) {
        if(s==" ") return true;
        boolean isPalindrome = true; 
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public boolean recursivePalindrome(int i, String s){
        if (i== s.length()) return true;

        // if (s.charAt(i) == s.charAt(s.length()-i-1)) return true;

        if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        i++;
        return recursivePalindrome(i,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s= sc.nextLine();
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        PalindromeCheck p = new PalindromeCheck();
        boolean ps = p.recursivePalindrome(0,s);
        if(ps){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
}
