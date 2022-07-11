/**
 * Write a program in java to enter a sentence and a word. Display the frequency of the entered word in a
 * sentence, word can also be found inside any other word
 */
import java.util.Scanner;
class WordFrequency{
    String str, word;
    String[] words;
    int count = 0;
    public static void main(String[] args) {
        WordFrequency ob = new WordFrequency();
        ob.input();
        ob.check();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        str = sc.nextLine().trim();
        System.out.println("Enter Word: ");
        word = sc.next().trim();
        words = str.split(" ");
    }
    void check(){
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(word.toLowerCase())){
                count++;
            }
        }
    }
    void display(){
        System.out.println("Frequeny of Word: "+ count);
    }
}