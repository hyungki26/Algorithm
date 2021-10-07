package leetCode.medium;
import java.util.*;

public class AvoidFloodinTheCity {

    public static int[] avoidFlood(int[] rains) {
        
        int[] ans = new int[rains.length];
        
        Map<Integer, Integer> set1 = new LinkedHashMap<Integer,Integer>();

        int zeroCnt = 0;

        for(int i=0;i<rains.length;i++){
            if(rains[i] > 0){
                if(set1.containsKey(rains[i])){
                    int tmp = set1.get(rains[i]);
                    set1.put(rains[i], tmp+1);
                }else{
                    set1.put(rains[i], 1);
                }
            }else{
                zeroCnt++;
            }
        }

        System.out.println(set1.toString());

        for(int i=0;i<zeroCnt;i++){
            set1
        }
        

        
        return ans;
    }

    public static void main(String[] args){
        int[] rains = new int[]{1, 2, 0, 0, 2, 1};

        int[] ans = avoidFlood(rains);
    }
}
