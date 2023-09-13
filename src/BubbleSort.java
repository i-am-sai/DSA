import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,-44,50,20,3};
        Arrays.sort(arr);
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
     for(int i =0; i < arr.length; i++){
      int last = arr.length - i - 1;
      int maxIndex = max(arr, 0, last);
      swap(arr, maxIndex, last);
     }

    }

    public  static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static int max(int[] arr, int start, int end){
        int max = start;
        for(int i =0; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
    return max;
    }

    static void bubble(int[] arr){
        boolean result;
        for(int i =0; i<arr.length; i++){
            result = false;
            for(int j = i+1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    result = true;
                }
            }
            if(!result){
                break;
            }
        }

    }

}
