public class P {
    public static int maxFrequencyNumber(int n, int[] arr) {
        // Write your code here
            int  result = 0;
            int count1 =0;
            int count2 =0;
            for(int i =0; i<arr.length; i++){
                for(int j =1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count1++;
                    }
                }
                if(count2 < count1){
                    count2 = count1;
                    result = arr[i];
                }
                count1 =0;
            }

      if(count2 > 1){
          return result;
      }
      return arr[0];
    }


    public static void main(String[] args) {
//        int[] arr = {2, 12, 2, 11, -12, 2, -1, 2, 2, 11, 12, 2, -6 };
        int[] arr = {2,4, 1,3};
        int n =13;
        System.out.println(maxFrequencyNumber(n, arr));
    }
}
