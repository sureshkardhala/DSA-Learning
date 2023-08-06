package Strings.Easy;

public class ReverseWords {
    class Solution {
        public static String reverse(String str){
            String res="";
            char ch;
            for(int i=str.length()-1; i>=0; i--){
                ch=str.charAt(i);
                res+=ch;
            }
            return res;
        }
        public String reverseWords(String s) {
        //    s=s.trim();
        //    Stack <String> st = new Stack<>();
        //    int start=0;
        //    int i=0;
        //    while(s.length()>i){
        //        if(s.charAt(i) == ' '){
        //            st.push(s.substring(start, i));
        //            s=s.substring(i, s.length()).trim();
        //            i=0;
        //            start=0;
        //        }
        //        i++;
        //    }
        // //    for(int i=0; i<s.length(); i++){
        // //        if(s.charAt(i) == ' '){
        // //            st.push(s.substring(start, i));
        // //            start=i+1;
        // //    }
        //    st.push(s.substring(start, s.length()));
        //    String res="";
        //    while(st.size()!=1){
        //        res+=st.peek()+" ";
        //        st.pop();
        //    }
        //    res+=st.peek();
        //    return res;
    
        int start=0;
        s=s.trim();
        String str ="";
        for(int end=0; end<s.length(); end++){
            if(s.charAt(end)== ' '){
                str+=reverse(s.substring(start, end))+" ";
                while(end < s.length()){
                    if(s.charAt(end)!=' '){
                        start=end;
                        break;
                    }
                    end++;
                }
            }
        }
        str+=reverse(s.substring(start, s.length()));
        str=reverse(str);
        return str;
        }
    }
}
