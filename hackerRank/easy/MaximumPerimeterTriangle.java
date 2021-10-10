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

class Result2 {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List result = new ArrayList<Integer>();

        sticks.sort(Comparator.reverseOrder());

        for(int i=0;i<sticks.size()-2;i++){
            if( (sticks.get(i) + sticks.get(i+1) > sticks.get(i+2)) &&
                (sticks.get(i+2) + sticks.get(i+1) > sticks.get(i)) &&
                (sticks.get(i) + sticks.get(i+2) > sticks.get(i+1))){
                result.add(sticks.get(i));
                result.add(sticks.get(i+1));
                result.add(sticks.get(i+2));

                Collections.sort(result);

                break;
            }
        }

        if(result.isEmpty())
            result.add(-1);

        return result;


    }

}

public class MaximumPerimeterTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result2.maximumPerimeterTriangle(sticks);

        System.out.println(result.toString());

        bufferedReader.close();
    }
}
