/**
 * Write a Program to input a string and find its encoding by summing up all the codes as (A-1, B-2,...,Z-26)
 * and arrange in ascending order from it.
 * If string terminates with anything other than (.?#$) then output a suitable message.
 * Display the string.
 *  SJC = 19 + 10 + 3 = 32
 *  SJC STAFF
 */

import java.util.Scanner;
class Encode {
    String str;
    String[] words;
    int[] codes;
    int len;
    public static void main(String[] args) {
        Encode ob = new Encode();
        ob.input();
        ob.findCode();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.nextLine().toUpperCase();
        if ((str.charAt(str.length() - 1) == '.') || (str.charAt(str.length() - 1) == '?') ||
                (str.charAt(str.length() - 1) == '#') || (str.charAt(str.length() - 1) == '$')) {
            str = str.substring(0, str.length() - 1);
        }
        else {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        words = str.split(" ");
        len = words.length;
        codes = new int[len];
    }
    void findCode(){
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                sum += (int) (words[i].charAt(j)) - 64;
            }
            codes[i] = sum;
            sum = 0;
        }
        sort(words, codes);
    }
    void sort(String[] str, int[] arr){
        int j, k, temp;
        String temp2;
        for(j = 0; j < len; j ++){
            for(k = 0; k < len - j - 1; k ++){
                if(arr[k]>arr[k + 1]){
                    temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;

                    temp2 = str[k + 1];
                    str[k + 1] = str[k];
                    str[k] = temp2;
                }
            }
        }
    }
    void display(){
        System.out.print("Output: ");
        for (int count = 0; count < len; count++) {
            System.out.print(words[count] + " ");
        }
    }
}
/**
 * Step 1: Start.
 * Step 2: Input a String.
 * Step 3: Check the last character of that string if it is (.?$#) remove the punctuation otherwise print wrong output.
 * Step 4: Extract the words in an array.
 * Step 5: Find the Sum of Code of each word and store in an array.
 * Step 6: Sort the word array with respect to the code array.
 * Step 7: Print the words from the word array.
 * Step 8: Stop.
 */