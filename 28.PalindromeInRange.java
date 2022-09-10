package com.TCSNQTPREPQUES.Math;

import java.util.ArrayList;

public class palindromeInRange {
    public static void main(String[] args) {
        int min = 100 , max = 150;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =min;i<max;i++){
            if(palindrome(i) == true)
                list.add(i);
        }
        System.out.println(list);

    }

    public static boolean palindrome(int x) {
        if(x == reverse(x)){
            return true;
        }else{
            return false;
        }
    }

    public static int reverse(int x) {
        int rev = 0; int digit = 0;
        while(x>0){
            digit = x % 10;
            rev = rev *10 +digit;
            x = x/10;
        }
        return rev;
    }

}
