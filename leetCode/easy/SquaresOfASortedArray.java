package leetCode.easy;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        
        int s = 0;
        int e = nums.length-1;
        
        
        for(int i=e;i>=0;i--){
            if(Math.abs(nums[e]) > Math.abs(nums[s])){
                result[i] = nums[e] * nums[e];
                e--;
            }else{
                result[i] = nums[s] *nums[s];
                s++;
            }
        }
        
        return result;
        
    }
    
}
