/**
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 입력  5
        20 10 35 30 7
    출력  : 7 35
 */
package BOJ;

import java.util.Scanner;

public class no_10818 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = -1000000;
        int min = 1000000;
        int[] arr = new int [N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        System.out.println(min + " " + max);

        sc.close();

    }
}
