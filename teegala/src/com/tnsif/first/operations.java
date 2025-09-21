package com.tnsif.first;

class Operators
{
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("a++ = " + (a++)); // post-increment
        System.out.println("--b = " + (--b)); // pre-decrement
        System.out.println("b-- = " + (b--)); // post-decrement
        System.out.println("-(a) = " + (-a)); // unary minus
        System.out.println("!(true) = " + (!true));

        // 3. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // 5. Bitwise Operators
        int m = 6, n = 3; // binary: 6=110, 3=011
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n = " + (m & n));   // 110 & 011 = 010 → 2
        System.out.println("m | n = " + (m | n));   // 110 | 011 = 111 → 7
        System.out.println("m ^ n = " + (m ^ n));   // 110 ^ 011 = 101 → 5
        System.out.println("~m = " + (~m));         // bitwise NOT
        System.out.println("m << 1 = " + (m << 1)); // left shift
        System.out.println("m >> 1 = " + (m >> 1)); // right shift
        System.out.println("m >>> 1 = " + (m >>> 1)); // unsigned right shift

        // 6. Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5 → " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3 → " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 → " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4 → " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 → " + c);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = "+max);
}
}
