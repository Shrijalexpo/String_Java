import java.util.Scanner;

/**
 *Read a single sentence which terminates with a full stop (.). The words are to be separated with a single
 * blank space and are in lower case. Arrange the words contained in the sentence according to the length of
 * the words in ascending order. If two words are of the same length then the word occurring first in the
 * input sentence should come first. For both, input and output the sentence must begin in upper case.
 */
import java.util.*;
class Q11_AscendingString{
    String str;
    int len;
    String[] words;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine();
        str = str.substring(0 , str.length() - 1);
        words = str.split(" ");
        len = words.length;
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
    void display(){
        System.out.println("Output: ");
        for(int counter = 0; counter < len; counter ++){
            if(counter + 1 < len){
                System.out.print(words[counter] + " ");
            }
            else{
                System.out.print(words[counter]);
            }
        }
        System.out.print(".");
    }
    public static void main(String[] Args){
        Q11_AscendingString descend = new Q11_AscendingString();
        descend.input();
        descend.ascendingOrder();
        descend.display();
    }
}