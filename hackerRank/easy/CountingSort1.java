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

class Result4 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] result = new int[arr.size()];
        
        for(int i=0;i<arr.size();i++){
            result[i] = 0;
        }
        
        for(int i=0;i<arr.size();i++){
            result[arr.get(i)-1] += 1;
        }
        
        System.out.println(Arrays.toString(result));
        
        List<Integer> re = new ArrayList<Integer>();

        for(int i=0;i<result.length;i++){
            re.add(result[i]);
        }
        
        return re;

    }

}

public class CountingSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result4.countingSort(arr);

        System.out.println(result.toString());

        bufferedReader.close();
    }
}
