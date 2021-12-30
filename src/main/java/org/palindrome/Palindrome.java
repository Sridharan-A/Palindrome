package org.palindrome;

import java.security.InvalidParameterException;

public class Palindrome {

    public boolean isPalindrome(int number) {
        if(number<0){
           throw new InvalidParameterException("Input less than 0");
        }
        int a=number;
        int temp;
        int rev = 0;
        while (a != 0) {
            rev=rev * 10;
            temp= a % 10;
            rev = rev  + temp;
            a = a / 10;
        }
        return number == rev;

    }


}