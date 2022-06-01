/**
 * Write a program in Java to input a Sentence. Find and display the frequency of palindrome words
 * (containing 3 or more characters) in the given string.
 * Sample Input: MADAM ARORA IS AN ENGLISH TEACHER
 * Sample Output: Frequency of Palindrome word = 2
 */
import java.util.Scanner;
class Q3_PalinCheck {
    String[] words;
    String str;
    int frequency;
    int len = 0;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
        words = str.split(" ");
    }
    boolean checkPalindrome(String word){
        String reverse = "";
        for(int counter = word.length()-1; counter >= 0; counter--){
            reverse += word.charAt(counter);
        }
        return reverse.equals(word);

    }

    void findFrequency(){
        for (int counter = 0; counter < words.length; counter ++){
            if (checkPalindrome(words[counter]) && words[counter].length() >= 3){
                frequency ++;
                System.out.println(words[counter]);
            }
        }
    }

    void display(){
        System.out.println("Frequency: " + frequency);
    }

    public static void main(String[] args) {
        Q3_PalinCheck obj = new Q3_PalinCheck();
        obj.input();
        obj.findFrequency();
        obj.display();
    }
}