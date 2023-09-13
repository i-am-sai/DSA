import java.lang.reflect.Array;
import java.util.Arrays;

class Exp {

    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3,-8};
      insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){

        for(int i =0; i<arr.length-1; i++){
            for(int j =i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void selectionn(int[] arr){
        for(int i =0; i<arr.length; i++){
            int last = arr.length - i -1;
            int max = max(arr, 0,last);
            swap(arr, max, last);
        }
    }

    public  static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int max(int[] arr,int s, int e){
        int max = s;
        for(int i =0; i<=e; i++){
            if(arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }


    static void bubble(int[] arr){
        boolean ans;
        for(int i =0; i<arr.length; i++){
            ans = false;
            for(int j =1; j<arr.length; j++)
            {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    ans = true;
                 }
            }
            if(!ans){
                break;
            }
        }
    }

}