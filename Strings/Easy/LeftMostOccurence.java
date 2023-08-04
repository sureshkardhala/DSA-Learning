package Strings.Easy;

public class LeftMostOccurence {
    public static int findLeftMostRepeatedChacter(String s1){
        for(int i=0; i<s1.length(); i++){
            for(int j=i+1; j<s1.length(); j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int findLeftMost(String str){
        int [] count = new int[256];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] >1){
                return i;
            }
        }
        return -1;
    }
    // public static int findLeftMostEf(String str){
    //     boolean [] count = new boolean[256];
    //     for(int i=str.length()-1; i>=0; i--){
    //         if(count[str.charAt(i)]){
    //             return i-1;
    //         }else{
    //             count[str.charAt(i)]=true;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        String s1="aabbcc";
        System.out.println(findLeftMost(s1));
    }
}
