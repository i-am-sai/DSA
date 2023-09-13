public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};
        int tar = 1;
        System.out.println(binarySearch(arr, tar) );


    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (end >= start) {
//            int mid = (start + end)/2; // Might be possible that (start + end) exceeds the range of the int.

            int mid = start + (end - start) / 2;  // EFFICIENT WAY

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
    return -1;
    }
}
