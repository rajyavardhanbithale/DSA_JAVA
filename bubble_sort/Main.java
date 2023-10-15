// package bubble_sort;


import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] arr = { 1, 5, 6, 8, 2, 6, 3, 5, 3, 10, 3, 2, 1, 100, 56, 98, 12, 31, 2, 0, 1 };
        bubble_sort(arr);
        // bsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length -i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    static void bubble_sort(int[] arr){
        boolean isSwap;
        for(int i=0;i<arr.length;i++){
            isSwap = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
       
        
    }
}