package _01Student_Practice;

import java.util.Scanner;

public class SP_03_2 {
    public static void main(String[] args) {
        /*
        Write a JAVA program to reverse a string
        Use for loop and create a method called reverseString(method name)

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Type into a word");
        String word = scan.nextLine();

        System.out.println("Reversed version of your input = "+reverseString(word));
    }
    public static String reverseString(String word){
        String reverseString="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseString+=word.charAt(i);
        }
        return reverseString;
    }
}
