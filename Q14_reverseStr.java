/**
 * Write a program in java to accept a sentence. Display the new Sentence after reversing
 * the characters of each word.
 */

import java.util.*;
class Q14_ReverseStr{
    String str;
    StringBuffer sb;
    String[] arr;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine();
        arr = str.split(" ");

    }
    void reverse(){
        for (int idx = 0; idx < arr.length; idx++) {
            sb = new StringBuffer(arr[idx]);
            sb.reverse();
            System.out.print(sb + " ");
        }
    }
    public static void main(String[] Args){
        Q14_ReverseStr rev = new Q14_ReverseStr();
        rev.input();
        rev.reverse();
    }
}