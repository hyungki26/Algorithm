package leetCode.easy;

import java.util.*;


class Solution {
    public static String reverseWords(String s) {
        String answer = "";

        String[] in = s.split(" ");

        for(int i=0;i< in.length;i++){
            StringBuffer sb = new StringBuffer();

            sb.append(in[i]);
            answer += sb.reverse().toString()+ " ";
        }


        return answer.trim();
        
    }
}

public class ReverseWordsinaString3 {
    
    public static void main(String[] args){
        String in = "Let's take LeetCode contest";


        System.out.println(Solution.reverseWords(in));
    }
    
}
