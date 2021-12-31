package TEST;

import java.util.*;

public class test_codi_03 {

    public static int solution(int[][] a){
        int result = 0;

        int n = a[0].length;
        int m = a.length;

        System.out.println(n +"NMN"+ m);
        int min = 0;

        if( n> m){
            min  = m;
        }else{
            min = n;
        }

        System.out.println("min::"+min);

        for(int i=min;i>2;i--){ // ms size
            for(int j=0;j<n-i;j++){
                for(int k=0;k<m-i;k++){
                    int tmp = 0;
                    tmp = mSChecker(i, a, j, k);
                    if(tmp > 0)
                        return tmp;
                }
            }
        }

        return result;

    }

    public static int mSChecker(int leng, int[][] a, int left, int right){
        
        int sum = 0;
        boolean re = true;

        for(int i=0;i<leng;i++){
            sum += a[left][right+i];
        }

        //가로
        for(int i=0;i<leng;i++){
            int tmp = 0;
            for(int j=0;j<leng;j++){
                tmp += a[left+i][right+j];
            }
            if(sum != tmp)
                re = false;
        }

        //세로
        for(int i=0;i<leng;i++){
            int tmp = 0;
            for(int j=0;j<leng;j++){
                tmp += a[left+j][right+i];
            }
            if(sum != tmp)
                re = false;
        }

        int le = 0;
        int ri = 0;

        //대각선
        for(int i=0;i<leng;i++){
            le += a[left+i][right+i];
            ri += a[left+i][right+leng-i-1];
        }

        if(le != sum || ri != sum){
            re =  false;
        }

        if(re){
            return sum;
        }else{
            return 0;
        }
    }




    public static void main(String[] args)  {

        /*
        A[0] = 1    B[0] = 4
        A[1] = 3    B[1] = 2
        A[2] = 2    B[2] = 5
        A[3] = 1    B[3] = 3
                    B[4] = 2
         */
        

        int[][] sq = {
            {4,3,4,5,3},
            {2,7,3,8,4},
            {1,7,6,5,2},
            {8,4,9,5,5}
        };


        //int[] A = new int[] {1,3,2,1};
        //int[] B = new int[] {4,2,5,3,2};

        int result = solution(sq);
        System.out.println(result);
    }    
    
}
