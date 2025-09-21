package com.tnsif.second;

class AmstrongOrNot {
    public static void main(String[] args) {
        int n = 153;   // number to check
        int original = n;
        int result = 0;
        int digits = 0;

        // count digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // calculate sum of digits^digits
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // check Armstrong condition
        if (result == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
}
}
}
