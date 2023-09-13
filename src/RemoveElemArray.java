import java.util.Arrays;

public class RemoveElemArray {
    public static int[] removeTheElement(int[] arr, int index) {

        int[] arr1 = new int[arr.length -1];
        for(int i = 0, k =0; i<arr.length; i++){

            if(i == index){
                continue;
            }

            arr1[k++] = arr[i];
        }

        return arr1;


    }

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int i =2;
        System.out.println(Arrays.toString(removeTheElement(arr, i)));

    }
}