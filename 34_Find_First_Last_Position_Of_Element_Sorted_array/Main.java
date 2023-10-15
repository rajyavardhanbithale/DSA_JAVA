// 34. Find First and Last Position of Element in Sorted Array
// Medium
// Topics
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109


public class Main{
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int search(int[] arr,int target,boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]>target){
                end = mid - 1;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                ans = mid;
                if(isFirst == true){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] arrgs){
        int[] arr = {5,7,7,8,8,8,8,10};
        int target = 8;

        int[] exec = searchRange(arr,target);
        
        for(int nums : exec){

            System.out.println(nums);
        }

      

    }
}