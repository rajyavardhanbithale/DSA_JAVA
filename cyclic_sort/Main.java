// When given number is in range from 1,N use CYCLIC SORT

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5,3,2,1,4 };

        cyclic_sort(arr);
        // cyclic_sort_variation(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void cyclic_sort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i]-1] ){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
    }

    static void cyclic_sort_variation(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }


}