// 645. Set Mismatch
// Easy
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]

// Example 2:
// Input: nums = [1,1]
// Output: [1,2]
 
// Constraints:
// 2 <= nums.length <= 104
// 1 <= nums[i] <= 104


import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {1,1};
        
        int[] run = findErrorNums(arr);
        System.out.println(Arrays.toString(run));

        
    }
    static void swap(int[] arr,int x,int y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
    }

    static int[] findErrorNums(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(i = 0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }


        return new int[]{-1,-1};
        
        
    }
}