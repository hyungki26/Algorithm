package hackerRank;
import java.util.*;

public class binarySearch2 {

    public static int[] bSearch(int[] arr, int target){
        int[] result = new int[2];

        int mid = arr.length/2;
        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if(arr[mid] > target){
                right = mid -1;
            }else if(arr[mid]< target){
                left = mid +1;
            }else{
                if(mid !=0 && arr[])
            }
        }

        return result;
    }

        
    public static void main(String[] args){
        int[] aa = new int[]{5,5,6,6,7,7,8,8,9,9,10};


    }
}
