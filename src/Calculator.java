import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("CALCULATOR");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value 1 and value 2 : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int result;
        System.out.println("Choose the Operation that you want to perform");
        char ch = in.next().trim().charAt(0);
        switch (ch){
            case '+' :
                result = a + b;
                System.out.println("Sum of two numbers is : " + result);
                break;
            case '-' :
                result = a - b;
                System.out.println("Differenc of two numbers is :" + result);
                break;
            case '*' :
                result = a*b;
                System.out.println("Product is : "+ result);
                break;
            case '/' :
                result = a/b;
                System.out.println("Division of two numbers is : "+ result);
                break;
            case '%' :
                result = a%b;
                System.out.println("Modulos of two numbers is : "+ result);
                break;
            default:
                System.out.println("Invaild");
        }
    }
}
