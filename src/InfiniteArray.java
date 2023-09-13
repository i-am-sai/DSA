public class InfiniteArray {

    public static void main(String[] args) {
    int[] arr ={3,5,6,9,10,90,100,123,127,200};
    int target = 10;
        System.out.println(findingRange(arr, target));

    }

    static int findingRange(int[] arr, int target){

        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = start + 1;
            end = end + (end - start +1)*2;
            start = temp;
        }
        return binarySearch(arr, target);
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
