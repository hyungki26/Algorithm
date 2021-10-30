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

        return space.get(Collections.max(st));
    }





    public static int luckBalance2(int x, List<Integer> space) {
        // Write your code here
        int answer = 0;

        ArrayList<Integer> result = new ArrayList<Integer>(); // 최소값 집합
        Queue<Integer> chunk = new LinkedList<>();            //겹치는 부분

        int min = 0;

        for(int i=0;i<space.size() - x+1;i++){    // 5개이고 x=3이면 3번만 수행
            
            if(i == 0){ // 초기값 셋팅
                min = Collections.min(space.subList(0, x)); 
                chunk.addAll(space.subList(1, x)); //겹치는 부분 셋팅 [0,1,2]일 경우 [1,2]
            }else{
                
                //min contaions chuck
                if(chunk.contains(min)){ //기존 min값이 겹치는 부분에 있을 경우
                    if(min > space.get(i+x-1)) //신규 값이 더 작을 경우 신규값으로 셋팅
                        min = space.get(i+x-1);
                }else{
                    //기존 min값이 맨 앞이라 빠졌을 경우엔 겹치는 부분의 최소값과 비교
                    if(Collections.min(chunk) >  space.get(i+x-1)){
                        min = space.get(i+x-1); // 신규값이 작을 경우 
                    }else{
                        min = Collections.min(chunk); // 겹체는 부분이 작을 경우
                    }
                }

                //겹치는 부분 설정
                chunk.poll();
                chunk.offer(space.get(i+x-1));
            }
            result.add(min);
            
            System.out.println("chunk::"+chunk.toString());
            System.out.println("result::"+result.toString());
        }
        
        answer = Collections.max(result);
        return answer;
    }

}

public class DiskSpaceAnalysis {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x = Integer.parseInt(firstMultipleInput[0]);

        //List<Integer> space = new ArrayList<>();

        List<Integer> space = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


        int result = Result6.luckBalance2(x, space);

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

3
2 5 4 6 8

timestamp
0000000

top
0

 */