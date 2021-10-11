package hackerRank.medium;

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

class Result3 {

    public static long candies(int n, List<Integer> arr) {
        long result = 0;

        int arrSize  = arr.size();

        int[] left = new int[arrSize];
        int[] right = new int[arrSize];
        left[0] = 1;
        right[arrSize-1] = 1;
        
        int left_tmp =1;
        int right_tmp = 1;

        for(int i=1;i<arrSize;i++){
            if(arr.get(i) > arr.get(i-1)){
                left_tmp++;
                left[i] = left_tmp;
            }else{
                left_tmp = 1;
                left[i] = left_tmp;
            }

            if(arr.get(arrSize - i-1) > arr.get(arrSize -i)){
                right_tmp++;
                right[arrSize-i-1] = right_tmp;
            }else{
                right_tmp = 1;
                right[arrSize-i-1] = right_tmp;
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int i=0;i<arrSize;i++){
            if(left[i] >= right[i]){
                result += left[i];
            }else{
                result += right[i];
            }
        }

        return result;
    }

}

public class candies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result3.candies(n, arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
