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
        //System.out.println(Arrays.toString(stu[0]));
        //System.out.println(Collections.frequency(Arrays.asList(stu_a), "19000000"));
        Map<String, String[]> stu_hash = new HashMap<String, String[]>();


        // 중복으로 동호회를 들어간 학생은 모두 삭제
        for(int i=0;i<stu.length;i++){
            String[] tmp = new String[]{stu[i][1], stu[i][2]};

            if(stu_hash.containsKey(stu[i][0])){
                //System.out.println("delkey::"+stu[i][0]);
                stu_hash.remove(stu[i][0]);
            }else{
                //System.out.println("inskey::"+stu[i][0]);
                stu_hash.put(stu[i][0], tmp);
            }
        }

        // hashmap에 있는 것들을 출력
        stu_hash.forEach((key, val)->{
            System.out.println(key);
            //System.out.println(Arrays.toString(val));
            System.out.println(val[0] +":::"+ val[1]);
        });

        // 동호회 별로 hashMap을 만들어야 하나?????

        
        return result;
    }


    public static void main(String[] args){

        int result = 0;

        String[] stu = {"13123820 BM Aclass"
                       ,"15047648 ECO Aclass"
                       ,"17869244 CS Aclass"
                       ,"19000000 EEng Aclass"
                       ,"14281264 Law Aclass"
                       ,"19000000 EEng Bclass"
                       ,"16188768 BM Bclass"
                       ,"14634411 Law Bclass"
                       ,"16628760 ECO Bclass"
                       ,"14863606 BM Cclass"
                       ,"13165700 Law Cclass"
                       ,"15215218 CS Cclass"};
        
        System.out.println(solution(stu, 4, 3, 3));
    }

    
}
