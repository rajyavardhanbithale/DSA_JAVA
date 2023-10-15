import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] arr = { 1, 5, 6, 8, 2, 6, 3, 5, 3, 10, 3, 2, 1, 100, 56, 98, 12, 31, 2, 0, 1 };
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void insertion_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}