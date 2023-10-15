// 448. Find All Numbers Disappeared in an Array
// Easy
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.


// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]


// Constraints:
// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
 
// Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        List<Integer> run = findDisappearedNumbers(arr);

        System.out.println(run);
        // System.out.println(Arrays.toString(arr));

        
    }   

    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ret.add(i+1);
            }
        }


        

        return ret;
        
    }
}