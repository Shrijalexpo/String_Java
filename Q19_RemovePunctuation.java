/**19. Write a program in Java to accept a sentence which includes all special
 * characters like punctuation marks viz. apostrophe ('), full stop (.), comma (,), semi colon (;)
 * etc. The program displays the sentence in reverse order (word wise) without using punctuation mark.**/

import java.util.*;
class Q19_RemovePunctuation{
    String str;
    int len;
    String[] words;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine();
        words = str.split(" ");
        len = words.length;
    }
    void removePunctuation(){
        for(int counter = 0; counter < len; counter ++){
            if(words[counter].charAt(words[counter].length() - 1) == '\'' || words[counter].charAt(words[counter].length() - 1) == '.'
                    || words[counter].charAt(words[counter].length() - 1) == ',' || words[counter].charAt(words[counter].length() - 1) == ';'){
                words[counter] = words[counter].substring(0 , words[counter].length() - 1);
            }
        }
    }
    void descendingOrder(){
        int i, j;
        String temp;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - i - 1; j ++){
                if(words[j].length() < words[j + 1].length()){
                    temp = words[j + 1];
                    words[j + 1] = words[j];
                    words[j] = temp;
                }
                else if(words[j].length() == words[j + 1].length()){
                    if(words[j].compareTo(words[j + 1]) < 0){
                        temp = words[j + 1];
                        words[j + 1] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }
    }
    void display(){
        System.out.println("Output: ");
        for(int counter = 0; counter < len; counter ++){
            System.out.print(words[counter] + " ");
        }
    }
    public static void main(String[] Args){
        Q19_RemovePunctuation descend = new Q19_RemovePunctuation();
        descend.input();
        descend.removePunctuation();
        descend.descendingOrder();
        descend.display();
    }
}