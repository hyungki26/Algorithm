/*
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
*/
package BOJ;

import java.util.Scanner;

public class no_4344 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int arrN = sc.nextInt();

        for(int i=0;i<arrN;i++){

            int[] pnt = new int[sc.nextInt()];

            double totPnt = 0;
            double mean = 0;
            float upperCnt = 0;

            for(int j=0;j<pnt.length;j++){
                pnt[j] = sc.nextInt();
                totPnt += pnt[j];
            }

            mean = totPnt / pnt.length;

            for(int k=0;k<pnt.length;k++){
                //System.out.println(pnt[k]);
                if(pnt[k] > mean)
                    upperCnt++;
            }
            //System.out.println(upperCnt+"  "+pnt.length + "  "+mean);
            //System.out.println(Float.valueOf(upperCnt)/pnt.length*100 + "%");
            System.out.printf("%.3f%%\n",(upperCnt/pnt.length)*100);
        }

        sc.close();
    }
    
}
