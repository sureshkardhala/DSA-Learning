package Strings.Easy;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "GEEKS"; // ABBA, ABCDCBA
        boolean ans = true;
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
