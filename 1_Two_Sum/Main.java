import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {3,3};

        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            int est = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
               
                if (est==nums[j]){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
        
    }
}