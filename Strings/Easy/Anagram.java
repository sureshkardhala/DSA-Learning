package Strings.Easy;

public class Anagram {
        
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //Convert into Array and sort them then check
        /*char[] sArray= s.toCharArray();
        char[] tArray= t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i=0; i<sArray.length; i++){
            if(sArray[i]!=tArray[i]){
                return false;
            }
        }
        */
        int freq[]= new int [26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
