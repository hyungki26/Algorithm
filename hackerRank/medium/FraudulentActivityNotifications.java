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



class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int result = 0;
        int oneYN = 0;
        
        if(d%2 > 0)
            oneYN = 1; // 0이면  중앙값 평균  1이면  중앙값 그냥 구함
        
        for(int i=d;i<expenditure.size();i++){
            double median = 0;

            if(oneYN ==1){
                median = expenditure.get(d- (int)Math.ceil(d/2));
            }else{
                median = (expenditure.get((int)Math.ceil(d/2))
                       + expenditure.get((int)Math.ceil(d/2) - 1))/2;
            }

            if(median*2 < expenditure.get(i))
                result++;
        }
        

        return result;
    }

}

public class FraudulentActivityNotifications {
  
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
