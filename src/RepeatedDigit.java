import java.util.Scanner;

public class RepeatedDigit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,5,67,};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int count = 0;
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]== target){
              count++;
            }
        }
        System.out.println(count);

    }
}
