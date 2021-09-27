/*
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
*/
package BOJ;

import java.util.Scanner;

public class no_1546 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int index = 0;
        int number  = N;

        do{
            String[] split = String.format("%2d", number).replace(" ", "0").split("");

            String s = split[0];
            String s2 = split[1];

            //System.out.println(s + s2);

            String[] split1 = s2.split("");
            String firstString = split1[split1.length - 1];

            int sum = Integer.parseInt(s) + Integer.parseInt(s2);

            String[] split2 = String.valueOf(sum).split("");
            String secondString = split2[split2.length - 1];

            number = Integer.parseInt(firstString + secondString);

            index++;

        }while(number != N);

        System.out.println(index);

        sc.close();
    }    
}
