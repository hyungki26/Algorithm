package TEST;

import java.util.*;


public class Test_pay_01 {

    public static int solution(String[] students, int n, int m, int k){
        int result = 0;

        String[][] stu = new String[students.length][3];
        String[] stu_a = new String[students.length];
        String[] stu_b = new String[students.length];
        String[] stu_c = new String[students.length];

        for(int i=0;i<students.length;i++){
            stu[i] = students[i].split(" ");
            stu_a[i] = students[i].split(" ")[0];
            stu_b[i] = students[i].split(" ")[1];
            stu_c[i] = students[i].split(" ")[2];
        }

        System.out.println(Arrays.toString(stu[0]));
        System.out.println(Collections.frequency(Arrays.asList(stu_a), "19000000"));
        
        return result;
    }


    public static void main(String[] args){

        int result = 0;

        String[] stu = {"13123820 BusinessManagement AAA"
                       ,"15047648 Economics AAA"
                       ,"17869244 ComputerScience AAA"
                       ,"19000000 ElectronicEngineering AAA"
                       ,"14281264 Law AAA"
                       ,"19000000 ElectronicEngineering BBB"
                       ,"16188768 BusinessManagement BBB"
                       ,"14634411 Law BBB"
                       ,"16628760 Economics BBB"
                       ,"14863606 BusinessManagement CCC"
                       ,"13165700 Law CCC"
                       ,"15215218 ComputerScience CCC"};
        
        System.out.println(solution(stu, 4, 3, 3));
    }

    
}
