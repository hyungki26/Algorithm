package leetCode.easy;

/*
Arrays.sort는  NlogN의 시간복잡도 가짐 느림
sorting을 위해서 O(N)의 시간복잡도로 코딩함
이게 가능한 이유 : 양쪽 끝에 있는 수가 절대값 기준 가장 큰 수임

입력 : [-4, -1, 0, 3, 10]

[, , , , 100]   0, 4
[, , , 16, 100]  0,3
[, , 9, 16, 100]  1, 3
[, 1, 9, 16, 100]  1, 2
[, 1, 9, 16, 100]  2, 2
*/
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
