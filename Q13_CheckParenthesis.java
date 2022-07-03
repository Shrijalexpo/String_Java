import java.util.Scanner;

/**
 * A string is said to be valid if it contains pair of parenthesis having text/ alphabet such as (TY) and the
 * string is said to be invalid if it contains nested parenthesis such as (Y (UP)).
 * For example: SUN (A(X) RISE) BEGINS FROM (RT) EAST is an "Invalid" string because in this string nested
 * parenthesis are present, but SUN (A) RISE BEGINS FROM (RT) EAST is a "Valid" string because there is no
 * nested parenthesis. Write a program to:
 * (a) Read a string/sentence and convert in capitals.
 * (b) Check the validity of the given string.
 * (c) If the string is valid, output the given string omitting the portion enclosed in brackets otherwise,
 * output a message "Sorry, and invalid string".
 * Test your program for the given sample data and also some other random data:
 */

// Input: mai (XY)chutiya (AY) hu /. i knew it.
// Valid
// Output: mai chutiya hu

// (A(X) RISE) BEGINS FROM (RT) EAST
// ( = +1, ) = -1: => +1 +1 =2 or more/ +1 -1 = 0

import java.util.*;

class Q13_CheckParenthesis {
    String str;
    int len;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().toUpperCase().trim();
        len = str.length();
    }

    void display() {
        int value = 0;
        for (int idx = 0; idx < len; idx++) {
            if (str.charAt(idx) == '(') {
                value++;
            } else if (str.charAt(idx) == ')') {
                value--;
                System.out.print("\b");
                continue;
            }
            if (value == 0) {
                System.out.print(str.charAt(idx));
            }
        }

    }

    void checkParenthesis() {
        int value = 0;
        for (int idx = 0; idx < len; idx++) {
            if (str.charAt(idx) == '(') {
                value++;
            } else if (str.charAt(idx) == ')') {
                value--;
            }
            if (value > 1) {
                System.out.println("Invalid");
                System.exit(0);
            }
        }
        if (value != 0) {
            System.out.println("Invalid");
            System.exit(0);
        }
    }

    public static void main(String[] Args) {
        Q13_CheckParenthesis ob = new Q13_CheckParenthesis();
        ob.input();
        ob.checkParenthesis();
        ob.display();
    }
}