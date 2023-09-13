import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Practise {

    public static void next(String[] arr,  char key){

      Arrays.sort(arr);

      for( int i =0; i<arr.length; i++){
              if(  key == arr[i].charAt(arr[i].length()-1)){
                  System.out.println(arr[i] + " " + (i+1));
              }
      }
    }

    public static void main(String[] args) {
       String[] arr = {"basic", "logic", "create", "magic"};
        char ch = 'c';
        next(arr, ch);

    }
}