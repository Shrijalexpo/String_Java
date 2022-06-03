import java.util.*;
/**
 Write a program to accept a sentence such that the words must be separated by a blank space.
 Perform the following tasks:
 (a) Find the number of words beginning and ending with a vowel.
 (b) Place the words which begin and end with a vowel at the beginning,
 followed by the remaining words as they occur in the sentence.

 Test your program with the sample sentence:
 Input: ANAMIKA AND SUMAN ARE NEVER GOING TO QUARREL ANYMORE
 Output: Number of words beginning and ending with a vowel = 3
 ANAMIKA ARE ANYMORE AND SUMAN NEVER GOING TO QUAR
 */
class Q23_CountVowels{
    String str;
    int len;
    String[] words;
    String output = "";
    String temp = "";
    int count = 0;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().toUpperCase();
        words = str.split(" ");
        len = words.length;
    }
    void countVowels(){
        for(int counter = 0; counter < len; counter ++){
            if((words[counter].charAt(0) == 'A' || words[counter].charAt(0) == 'E' || words[counter].charAt(0) == 'I' ||
                    words[counter].charAt(0) == 'O' || words[counter].charAt(0) == 'U')&&
                    (words[counter].charAt(words[counter].length() - 1) == 'A' ||
                            words[counter].charAt(words[counter].length() - 1) == 'E' || words[counter].charAt(words[counter].length() - 1) == 'I' ||
                            words[counter].charAt(words[counter].length() - 1) == 'O' || words[counter].charAt(words[counter].length() - 1) == 'U')){
                count ++;
                output += words[counter] + " ";
            }
            else{
                temp += words[counter] + " ";
            }
        }
        output += temp;
    }
    void display(){
        System.out.println("Output: Number of words beginning and ending with a vowel = " + count);
        System.out.println(output);
    }
    public static void main(String[] Args){
        Q23_CountVowels words = new Q23_CountVowels();
        words.input();
        words.countVowels();
        words.display();
    }
}