package com.tnsif.second;

class PalindromeOrNot {
    public static void main(String[] args) {
        int n = 121;   // number to check
        int original = n;
        int reverse = 0;

        // reverse the number
        while (n > 0) {
            int digit = n % 10;          // get last digit
            reverse = reverse * 10 + digit; // build reverse
            n = n / 10;                  // remove last digit
        }

        // check if palindrome
        if (original == reverse) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
 }
}
}
