import java.util.Scanner;

/**
 * Write a program to read a string/sentence and output the number of times each word occurs in the entire text.
 * At the end, the output should be sorted into ascending order words along with usage of words. You may assume
 * that the entire text is in capitals (you may also convert in capitals for your betterment) and each word is
 * followed by a blank space except the last one, which is followed by a full stop. Let there be at the most 50
 * words in the text.
 */
import java.util.*;
class Q12_FrequencyStr{
    String str;
    int len;
    String[] words;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().toUpperCase().trim();
        str = str.substring(0 , str.length() - 1);
        words = str.split(" ");
        len = words.length;
        if(len > 50){
            System.out.println("F**k you b*tch");
            System.exit(0);
        }
    }
    void ascendingOrder(){
        int i, j;
        String temp;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - i - 1; j ++){
                if(words[j].length() > words[j + 1].length()){
                    temp = words[j + 1];
                    words[j + 1] = words[j];
                    words[j] = temp;
                }
            }
        }
    }
    void frequency(){
        int count = 1;
        int idx;
        for (idx = 0; idx < len - 1; idx++) {
            if(words[idx].compareTo(words[idx+1]) == 0){
                count ++;
            }
            else{
                System.out.println(words[idx] + "\t:" + count);
                count = 1;
            }
        }
        System.out.println(words[idx] + "\t:" + count);
    }
    void display(){
        System.out.println("No. of words in sentence: "+ len);
    }

    public static void main(String[] Args){
        Q12_FrequencyStr ob = new Q12_FrequencyStr();
        ob.input();
        ob.ascendingOrder();
        ob.frequency();
        ob.display();
    }
}