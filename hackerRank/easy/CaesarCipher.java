package hackerRank.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result6 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] tmp = s.toCharArray();
        
        for(int i=0;i<tmp.length;i++){
            System.out.println((int)tmp[i]);
            
            if((int)tmp[i] >= 65 && (int)tmp[i] <= 90){ // 대문자
                if((int)tmp[i] + k > 90){
                    tmp[i] = (char)((int)tmp[i] +k -26);
                }else{
                    tmp[i] = (char)((int)tmp[i]+k);
                }
            }else if((int)tmp[i] >= 97 && (int)tmp[i] <= 122){ // 소문자
                if((int)tmp[i] + k > 122){
                    tmp[i] = (char)((int)tmp[i]+k -26);
                }else{
                    tmp[i] = (char)((int)tmp[i]+k);
                }
            }
        }

        for(int i=0;i<tmp.length;i++){
            System.out.println((int)tmp[i]);
        }

        
        return String.valueOf(tmp);
    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result6.caesarCipher(s, k);

        System.out.println(result);

        bufferedReader.close();

    }
}
