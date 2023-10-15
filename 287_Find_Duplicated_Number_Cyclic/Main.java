// 287. Find the Duplicate Number
// Medium

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.

// Example 1:
// Input: nums = [1,3,4,2,2]
// Output: 2

// Example 2:
// Input: nums = [3,1,3,4,2]
// Output: 3

// Constraints:
// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.

// Follow up:
// How can we prove that at least one duplicate number must exist in nums?
// Can you solve the problem in linear runtime complexity?

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1,3,4,2,2  };

        int run = findDuplicate(arr);
        // findDuplicate(arr);
        System.out.println(run);
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        
        return nums[nums.length-1];

        
    }
}