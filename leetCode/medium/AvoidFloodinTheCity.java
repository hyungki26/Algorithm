package leetCode.medium;
import java.util.*;

public class AvoidFloodinTheCity {

    public static int[] avoidFlood(int[] rains) {
        
        int[] ans = new int[rains.length];
        
        Map<Integer, Integer> set1 = new LinkedHashMap<Integer,Integer>();
        ArrayList<Integer> zeroSet = new ArrayList<Integer>();

        int zeroCnt = 0;

        for(int i=0;i<rains.length;i++){
            if(rains[i] > 0){
                if(set1.containsKey(rains[i])){
                    int tmp = set1.get(rains[i]);
                    set1.put(rains[i], tmp+1);
                }else{
                    set1.put(rains[i], 1);
                }

                ans[i] = -1;

            }else{
                zeroSet.add(i);
                zeroCnt++;
            }
        }

        System.out.println(set1.toString());
        System.out.println(Arrays.toString(ans));
        System.out.println(zeroCnt);

        set1.forEach((key, value) -> { 
            System.out.println("Key:" + key + ", Value:" + value);
        });


        

        
        return ans;
    }

    public static void main(String[] args){
        int[] rains = new int[]{1, 2, 0, 0, 2, 1};

        int[] ans = avoidFlood(rains);
    }
}
