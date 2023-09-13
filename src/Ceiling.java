public class Ceiling {

    static int Ceiling(int[] arr, int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(end >= start){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }

        }
    return arr[start];
    }

    static int Floor(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(end >= start){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }

        }
        return arr[end];
    }


    public static void main(String[] args) {
      int[] arr = {2,3,4,5,9,14,16,18};
      int target = 6;
        System.out.println(Ceiling(arr, target));
        System.out.println(Floor(arr, target));

    }
}
