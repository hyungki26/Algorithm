/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

*/
package BOJ;

import java.lang.reflect.Array;
import java.util.Scanner;

public class no_2562 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int[] arrN = new int[9];

        int maxVal = 0;
        int maxIdx = 0;

        for(int i=0; i < arrN.length; i++){
            arrN[i] = sc.nextInt();

            if(maxVal < arrN[i]){
                maxVal = arrN[i];
                maxIdx = i+1;
            }
        }

        System.out.println(maxVal);
        System.out.println(maxIdx);

        sc.close();
    }    
}
