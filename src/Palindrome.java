import java.util.Scanner;

public class Palindrome {

    static boolean Pain(String str) {
    str = str.toLowerCase();
    for(int i =0; i<str.length(); i++){
        int start = str.charAt(i);
        int end = str.charAt(str.length() - 1 -i);
        if( start != end){
            return false;
        }
    }
        return true;
    }

    public static void main(String[] args) {
        int i = 4321;
        int j = 0;

        while(i>0){
           int  rem  = i %10;
           i = i/10;
           j = j*10 + rem;

        }
        System.out.println(j);

String s ="SaiaS";

        System.out.println( Pain(s));

//        String s = "adios";
//      String r = "";
//      char ch;
//      for(int i =0; i<s.length(); i++){
//          ch = s.charAt(i);
//          r= ch + r;
//      }
//        System.out.println(r);


    }
}
