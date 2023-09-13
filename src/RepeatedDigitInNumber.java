import java.util.Scanner;

public class RepeatedDigitInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Enter a target digit : ");
        int target = in.nextInt();
        int count = 0;
        while(n > 0) {
           int rem = n % 10;
            if(rem==target){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

//        INT TO STRING WAY OF SLOVING
//        String t = String.valueOf(target);
//        String s = String.valueOf(n);
//        System.out.println(s);
//        int count = 0;
//        for(int i = 0; i<s.length(); i++) {
//            if(s.charAt(i) == t.charAt(0)) {
//                count++;
//            }
//        }
//        System.out.println(count);


