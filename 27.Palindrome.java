package com.TCSNQTPREPQUES.Math;

public class palindrome2 {
    public static void main(String[] args) {
        int n  = 12321;
        int rev = reverse(n);
        if(n==rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }

    //3=123%10    3
    // 12=123/10
    //2=12%10     3*10+2=32
    //1=12/10
    //1=1%10      32*10+1=321
    //0.1=1/10  stop

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
