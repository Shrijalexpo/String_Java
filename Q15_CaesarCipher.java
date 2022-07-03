/**
 * Caesar Cipher is an encryption technique which is implemented as ROT 13('Rotate by 13 place'). It is simple
 * letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, with
 * the other characters remaining unchanged.
 * Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
 * Encrypt the text if valid as per the Caesar Cipher.
 */

//a --> n
//b --> o
//c

//m --> z



import java.util.*;
class Q15_CaesarCipher {
    String str;
    String out = "";
    int len;

    void input() {
        String[] words;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        str = sc.nextLine().trim();
        len = str.length();
        if (len < 3 || len > 100) {
            System.out.println("Invalid Length");
            System.exit(0);
        }
    }

    void caesar() {
        char ch;
        for (int idx = 0; idx < len; idx++) {
            ch = str.charAt(idx);
            if ((ch >= 'A' && ch <= 'M') || (ch >= 'a' && ch <= 'm')) {
                out += (char)(ch + 13);
            }
            else if ((ch >= 'N' && ch <= 'Z') || (ch >= 'n' && ch <= 'z')) {
                out += (char)(ch - 13);
            }
            else
                out += ch;
        }
    }
    void display(){
        System.out.println("The cipher test is: "+ out);
    }

    public static void main(String[] args) {
        Q15_CaesarCipher ob = new Q15_CaesarCipher();
        ob.input();
        ob.caesar();
        ob.display();

    }
}

