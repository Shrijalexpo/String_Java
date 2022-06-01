/** While typing, a typewriter has made two or more consecutive blank spaces between the words of a sentence.
 * Write a program in Java to replace two or more consecutive blanks by a single blank and display the rectified sentence.
 * Sample Input: Understanding......... computer... science for............. ISC ........... is written by Vijay...
 * ..... Dilip........... Kumar............. Dey Kumar ............. Pandey ******** and
 *
 * Sample Output: Understanding Computer Science for ISC is written by Vijay Kumar
 * Pandey and Dilip Kumar Dey
 *
 */
import java.util.Scanner;

class Q9_TypewriterMistake{
    String str;
    int len;
    String[] words;
    String mistakeCorrected = "";
    void inputMistaken(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
        words = str.split(" ");

    }
    void correctMistake(){
        for(int counter = 0; counter< words.length; counter++){
            if (words[counter] != ""){
                mistakeCorrected += words[counter] + " ";
            }
        }
    }
    void displayCorrected(){
        System.out.println("Corrected mistake of fucking typewriter: "+ mistakeCorrected);
    }
    public static void main(String[] args) {
        Q9_TypewriterMistake mistake = new Q9_TypewriterMistake();
        mistake.inputMistaken();
        mistake.correctMistake();
        mistake.displayCorrected();
    }
}




