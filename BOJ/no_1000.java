package BOJ;

import java.util.Scanner;

public class no_1000 {

    public static void sum(int a, int b){
        int c = 0;

        c = a + b;

        System.out.println(c);
    }

    public static void main(String[] args){

        int A, B;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        sum(A, B);

        sc.close();
    }    
}
