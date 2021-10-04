/*
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10 41
11 42
12 44
13 111
*/
package PRGM.level2;

import java.util.*;

public class S124나라의숫자 {

    public static String solution(int n) {
        String answer = "";

        return answer;
    }

    public static String make_base(int n){
        
        n--;

        String fr = String.valueOf(n/3);
        String ba = String.valueOf(n%3);

        if(fr.equals("0"))
            return ba;

        return make_base(Integer.valueOf(fr)) + ba;

    }

    public static void main(String[] args){
        int m = 12;

        String answer = make_base(m);

        answer.replace("2","4");
        answer.replace("1","2");
        answer.replace("0","1");
        
        System.out.println(answer);

        System.out.println(make_base(3));
        System.out.println(make_base(4));
    }
    
}
