package TEST;

import java.util.*;

public class test_codi_01 {
    public static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0;

        for (int k = 0; k < n; k++) {
            while (i < m - 1 && B[i] <= A[k]){
                //System.out.println(B[i] + "::"+A[k]);
                i += 1;

                if (A[k] == B[i])
                return A[k];
            }
        }

        return -1;
    }

    public static void main(String[] args)  {

        /*
        A[0] = 1    B[0] = 4
        A[1] = 3    B[1] = 2
        A[2] = 2    B[2] = 5
        A[3] = 1    B[3] = 3
                    B[4] = 2
         */
        int[] A = new int[] {1,1,1,1,2,4};
        int[] B = new int[] {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4};

        //int[] A = new int[] {1,3,2,1};
        //int[] B = new int[] {4,2,5,3,2};

        int result = solution(A, B);
        System.out.println(result);
    }    
}
