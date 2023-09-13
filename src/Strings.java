import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args)
    {
        // Methods
        String name = "SiaSai";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.toUpperCase().charAt(1));
        System.out.println(Arrays.toString(name.split("a")));
        System.out.println("         SIaa    ");
        System.out.println("   Sia   ".strip());

//        Scanner in = new Scanner(System.in);
//        String A = in.next();
//        String B = in.next();
//        System.out.println(A.length() + B.length());
//        int i = A.compareTo(B);
//        int j = B.compareTo(A);
//        System.out.println(A);
//        if(i > j){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

        // Pretty Printing
//        float  a = 456.1274f;
//        System.out.println(a);
//        System.out.printf("%.2f", a );
//        System.out.println( " " + Math.PI);
//
//        // Operators
//        System.out.println('a' + 'b'); // ASCII values
//        System.out.println("a" + "b");  // concatenate two strings
//        System.out.println((char)('a' + 3)); // TypeCasting
//        System.out.println("a" + 1);
//        // This is same as after  a few steps "a" + "i"
//        // integer will be converted to Integer that will call toString();
//        System.out.println("Sai" + new ArrayList<>());
//
//        String series ="";
//        for(int i =0; i<26; i++){
//            char ch = (char)('a' + i);
//            System.out.println(ch + " ");
//            series += ch;
//        }
//        System.out.println(series);
    }
}
