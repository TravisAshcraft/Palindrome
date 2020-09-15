package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.next();

        if(isPalindromic(s)){
            System.out.println(s + " is a palindrome");
        }
        else{
            System.out.println(s + " is not a palindrome");
        }

    }

    public static boolean isPalindromic(String pString){
        //Rule 1
        //This is the base case when the length of pString is less than or equal to 1.
        if (pString.length() <= 1){
            return true;
        }
        else{
            //Rule 2
            //Checks to see if the char at the first of pString and the last char of pString is the same
            //if true it is a palindrome, if not it returns false
            if(pString.charAt(0) != pString.charAt(pString.length() -1)){
                return false;
            }
            else{
                //Rule 3
                //Here we check step 2 just with out the the first and last char
                //instead we cut those two and check palindrome, this is where our recursion happens it continues unitl
                //the base case pString.length() <= 1 is completed.
                String t = pString.substring(1,pString.length()-1);
                return true;
            }
        }
    }

}
