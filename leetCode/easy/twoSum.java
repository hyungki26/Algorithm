package leetCode.easy;

import java.util.*;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target)
                    return new int[]{i, j};
            }
        }
        
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] aaa = {1,2,3,4,5};

        

    }


    
}
