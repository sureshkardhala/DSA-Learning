package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string vlue : ");
        String s = sc.nextLine();

        //For Small letters
        int []hash1 = new int [26];
        //For Capital letters
        int []hash2 = new int[26];
        //For All letters
        int []hash3 = new int [26];
        // System.out.println(hash1[s.charAt(0)-'a']);

        //For small cases
        // for (int i=0; i<s.length(); i++ ){
        //     hash1[s.charAt(i) - 'a'] +=1;
        // }

        //For capital letters
        for (int i=0; i<s.length(); i++ ){
            hash2[s.charAt(i) - 'A'] +=1;
        }

         //For all letters
        // for (int i=0; i<s.length(); i++ ){
        //     hash3[s.charAt(i)] +=1;
        // }



        System.out.println("Enter no of quries");
        int q= sc.nextInt();
        while(q>0){
            System.out.println("Enter character");
            String ch = sc.next();
            //For small
            // System.out.println(ch + " count is : "+ hash1[ch.charAt(0)-'a'] );

            //For capital
            System.out.println(ch + " count is : "+ hash2[ch.charAt(0)-'A'] );

            //For All letters
            // System.out.println(ch + " count is : "+ hash1[ch.charAt(0)]);
            q--;
        }

    }
}
