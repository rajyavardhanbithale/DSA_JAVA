import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 8, 2, 6, 3, 5, 3, 10, 3, 2, 1, 100, 56, 98, 12, 31, 2, 0, 1 };
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start = arr.length-i-1;
            int end = max(arr,0,start);
            swap(arr, start, end);

        }
    }
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int max(int[] arr,int start,int end){
        int max = start;
        for(int i=max;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

   
}