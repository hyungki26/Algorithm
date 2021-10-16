package hackerRank;

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

    public static int luckBalance(int x, List<Integer> space) {
        
        // Write your code here
        Stack<Integer> st = new Stack<>();

        int chunkNum = 1;

        st.push(0);

        for(int i=1;i<space.size();i++){
            if(i < x){
                if(space.get(i) < space.get(st.peek())){
                    st.pop();
                    st.push(i);
                }
            }else{
                int peek = st.peek();
                if(peek >= chunkNum){
                    if(space.get(i)<space.get(peek)){
                        st.push(i);
                    }else{
                        st.push(peek);
                    }
                }else{
                    st.push(i);

                    int j = chunkNum;
                    int count = 0;

                    while(count++ < x){
                        if(space.get(j) < space.get(st.peek())){
                            st.pop();
                            st.push(j);
                        }
                        j++;
                    }
                }

                chunkNum++;
            }
        }

        System.out.println(st.toString());
        return space.get(Collections.max(st));
    }

}

public class DiskSpaceAnalysis {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int x = Integer.parseInt(firstMultipleInput[1]);

        //List<Integer> space = new ArrayList<>();

        List<Integer> space = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


        int result = Result6.luckBalance(x, space);

        System.out.println("RESULT:::"+result);

        bufferedReader.close();

    }
    
}

/*
n = 4 
x = 2
space = [8,2,4,6]
4 2
8 2 4 6

5 1
1 2 3 1 2

timestamp
0000000

top
0

 */