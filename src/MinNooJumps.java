public class MinNooJumps {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,6,7};
        System.out.println(minJumps(arr));

    }

    static int minJumps(int[] arr){
        // your code here
        int i =0;
        int count = 0;
        int n =0;

        while(i < arr.length-1) {
            n = arr[i];
            if (arr[i] > 0) {
                i = i + n;
                count++;
            }
        }
        return count;
    }
}
