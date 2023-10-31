import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9,10,12,13,14};

        traversing(arr);

        System.out.println();
        System.out.println("Linear Search");
        int search = 14;
        System.out.println("Searching.. "+search +" : "+linear_search(arr, search));
     
        System.out.println();
        System.out.println("Binary Search");
        search = 15;
        System.out.println("Searching.. "+search +" : "+binary_search(arr, search));
        
        System.out.println();
        System.out.println("Bubble Sort");
        int[] arr1 = {1,8,6,3,2,7,8,9,5,6,6,12,23,620,78,1,9};
        bubble_sort(arr1);
        traversing(arr1);
     
        System.out.println();
        System.out.println("Insertion Sort");
        int[] arr2 = {1,8,6,3,2,7,8,9,5,6,1,0,16,12,23,620,78,1,9};
        insertion_sort(arr2);
        traversing(arr2);

        System.out.println();
        System.out.println("Min And Max");
        int[] arr3 = {8,6,3,2,7,8,9,5,6,1,0,16,12,23,-8,620,78,1,9,-91};
        int[] run = min_and_max(arr3);
        System.out.print(Arrays.toString(run));

        System.out.println();
        System.out.println("Reverse Array");
        int[] arr4 = {1,2,3,4,5,6,7,8,9};
        reverse(arr4);        
        
        System.out.println();
        System.out.println("Rotate Array");
        int[] arr5 = {1,2,3,4,5,6,7,8,9};
        rotate_array(arr5, 2);
 
        
    }


    static void traversing(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static boolean linear_search(int[] arr,int key){

        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return true;
            }
        }
        return false;
    }

    static boolean binary_search(int[] arr,int key){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(key == arr[mid]){
                return true;
            }
            else if(arr[mid]>key){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }

    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // --------------- Sorting------------------
    
    // Bubble Sort
    static void bubble_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    swap(arr, i, j);

                }
            }
        }
    }
    
    // Insertion Sort 
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

    // Min and max element
    static int[] min_and_max(int[] arr){
        // Min element
        int min = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        // max element
        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return new int[]{min,max};
    }

    // Reverse Array
    static void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    // Rotate Array
    static void rotate_array(int arr[], int step){

        int[] temp = new int[arr.length];

        for(int i=step;i<arr.length;i++){
            temp[i-step] = arr[i];
        }

        for(int i=0;i<step;i++){
            temp[i + arr.length - step] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
        }




    }

}