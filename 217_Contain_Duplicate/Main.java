import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3,3 };

        System.out.println(containsDuplicate(arr));
    }



    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
   
        

        return false;

    }
}