import java.util.*;
/**
 * One of the Systems of calculating word value is Hebrew Numerology, in which corresponding numberic value of the
 * letters (1 to 26 for A to Z) are joined together. A "Happy Word" is a word whose eventual sum of square of the digits
 * of its word value is equal to 1. Write a program to input a word and check whether it is a 'Happy Word' or not.
 * The program displays a message accordingly.
 */
//Input VAT
// place value of V =22, A = 1, T =20
// Solution: 22120 => 2^2 + 2^2 + 1^2 + 2^2 + 0 => 13 => 1^2 + 3^2 => 10 => 1

class Q22_HebrewNemerology{
    String str;
    int len;
    int value = 0;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.next().toUpperCase();
        len = str.length();
    }

    void hebrew(){
        for(int counter = 0; counter < len; counter ++){
            if((int)str.charAt(counter) - 64 >= 10){
                value = value * 100 + ((int)(str.charAt(counter)) - 64);
            }
            else{
                value = value * 10 + ((int)(str.charAt(counter)) - 64);
            }
        }
    }

    void isHappyWord(){
        int output = 0;
        while(value >= 10){
            int temp = value;
            while(temp > 0){
                output += Math.pow(temp % 10, 2);
                temp /= 10;
            }
            if(output == 1){
                value = output;
                break;
            }
            value = output;
            output = 0;
        }
        if(value == 1){
            System.out.println(str + " is a happy word");
        }
        else{
            System.out.println(str + " is not a happy word");
        }
    }

    public static void main(String[] args){
        Q22_HebrewNemerology number = new Q22_HebrewNemerology();
        number.input();
        number.hebrew();
        number.isHappyWord();
    }
}

