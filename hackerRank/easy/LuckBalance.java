package hackerRank.easy;
// https://www.hackerrank.com/challenges/luck-balance/problem

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

class Result1 {

    /*
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int result = 0;

        // 2차원  배열  정렬 
        Collections.sort(contests, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(0) - o1.get(0);
            }
        });

        System.out.println(contests.toString());

        for(int i=0;i<contests.size();i++){
            if(contests.get(i).get(1) == 0){
                result += contests.get(i).get(0);
            }else{
                if(k == 0){
                    result -= contests.get(i).get(0);
                }else{
                    result += contests.get(i).get(0);
                    k--;
                }
            }
        }

        return result;

    }

}

public class LuckBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                contests.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result1.luckBalance(k, contests);

        System.out.println("RESULT:::"+result);

        bufferedReader.close();

    }
    
}
