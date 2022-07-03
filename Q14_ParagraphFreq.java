import java.util.Scanner;

/**
 * Input a paragraph containing 'n' number of sentences where (1 <= n < 4). The words are to be separated with
 * a single blank space and are in UPPERCASE. A sentence may be terminated either with a full stop. Or a question
 * mark ? only. Any other character may be ignored. Perform the following operations:
 * (a) Accept the number of sentences. If the number of sentences exceeds the limit, an appropriate error
 * message must be displayed.
 * (b) Find the number of words in the whole paragraph.
 * (c) Display the words in ascending order of their frequency. Words with same frequency may appear in any order.
 */

import java.util.*;
class Q14_ParagraphFreq{
    String str;
    int len;
    void input(){
        String[] words;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().toUpperCase().trim();
        len = str.length();
        int count = 0;
        for (int idx = 0; idx < len; idx++) {
            if(str.charAt(idx) == '.' || str.charAt(idx) == '?'){
                count++;
            }
        }
        if(count > 4){
            System.out.println("Invalid no. of lines");
            System.exit(0);
        }
        words = str.split(" ");
        len = words.length;
        System.out.println("No. of word in the paragraph: "+ len);
    }
    void arrange(){
        String sentence= "";
        System.out.println("xyz");
        for (int idx = 0; idx < len; idx++) {
            sentence += str.charAt(idx);
            if(str.charAt(idx) == '.' || str.charAt(idx) == '?'){
                sort(sentence.split(" "));
            }
            sentence = "";
        }
    }
    void sort(String[] words){
        int i, j;
        System.out.println("abc");
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
        display(words);
    }
    void display(String[] words){
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
        Q14_ParagraphFreq ob = new  Q14_ParagraphFreq();
        ob.input();
        ob.arrange();
    }
}
// YOU ARE THE SHADOWS TO MY LIFE. DID YOU FEEL US? WHERE ARE YOU NOW? ATLANTIS.

