public class EvenOddd {

    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(even(arr));
        System.out.println(EvenCheck(34));
        System.out.println(digits(0));
        System.out.println(digit2(152));
    }

    static boolean EvenCheck(int num){
        if(num % 2 ==0){
            return true;
        }
        return false;
    }

    static int digits(int num){

        if(num < 0){
            num = num -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digit2(int num){
        return (int)(Math.log10(num) + 1);   // Fourmula
    }

public static int even(int[] arr){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] % 2==0){
                count++;
            }
        }
        return count;
}

    public static int odd(int[] arr){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] % 2==0){
                count++;
            }
        }
        return count;
    }

}
