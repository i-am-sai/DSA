import java.util.Arrays;

public class MergeArray {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] mergedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;
    }


    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3,4, 5, };
        int[] arr2 = {7,8};
        int targetSum = 5;
        int end = 2;
       ninjaAndSortedArrays(arr1, arr2, targetSum, end);


    }
}
