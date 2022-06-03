/**Write a program in Java to accept a string terminated by a full stop. Arrange all the 
 * words in descending order of their lengths. Same length of words should be sorted 
 * alphabetically. Each word must start with upper case and the sentence should be 
 * terminated by full stop. Sample Input: This is the human resource department.
 Sample Output: Department Resource Human This is.**/

import java.util.*;
class Q15_DescendingString{
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
    void toCaps(){
        for(int counter = 0; counter < len; counter ++){
            words[counter] = Character.toUpperCase(words[counter].charAt(0)) + words[counter].substring(1);
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
        System.out.print(".");
    }
    public static void main(String[] Args){
        Q15_DescendingString descend = new Q15_DescendingString();
        descend.input();
        descend.toCaps();
        descend.descendingOrder();
        descend.display();
    }
}