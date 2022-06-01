/** Write a program in Java to accept a sentence and add 'an', if a word begins with a
 *  vowel. Display the new Sentence.
 *  Sample Input: ANDROID IS OPERATING SYSTEM
 *  Sample Output: AN ANDROID IS AN OPERATING SYSTEM
 */

import java.util.Scanner;
class Q6_ArticleVowel{
    String str , output = "";
    int len;
    String[] words;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine().toUpperCase();
        len = str.length();
        words = str.split(" ");
    }
    void addArticle(){
        char temp;
        for(int counter = 0; counter < words.length; counter ++){
            temp = words[counter].charAt(0);
            if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U'){
                output += "AN "+ words[counter]+ " ";
            }
            else {
                output += words[counter]+ " ";
            }
        }
    }
    void display(){
        System.out.println("Output: "+output);
    }
    public static void main(String[] args) {
        Q6_ArticleVowel obj = new Q6_ArticleVowel();
        obj.input();
        obj.addArticle();
        obj.display();
    }
}
