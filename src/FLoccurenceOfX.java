import java.util.ArrayList;
public class FLoccurenceOfX {

    public static void main(String[] args){

        long[] arr = {1,2,3,5,5,5,5,7,8,9,};
       int x = 5;
       int n = 10;
        System.out.println(find(arr,n, x));


    }
   static ArrayList<Integer> find(long arr[], int n, int x)
    {
        // code here
        //Check for first occurence
        ArrayList<Integer> index = new ArrayList<>();
        index.add(1);
        index.add(1);
        int start = search(arr, x, true);
        int end = search(arr, x, false);

        index.set(0, start);
        index.set(1, end);

     return index;
    }

    static int search(long arr[], int x , boolean firstIndex){

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(end >= start) {

            int mid = (start + end) / 2;


            if (x > arr[mid]) {
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;

                if (firstIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return ans;

        }
}