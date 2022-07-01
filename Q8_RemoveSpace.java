/**
 *Prog. 8: While typing, a typist has created two or more consecutive blank spaces between the arr of a sentence.
 * Write a program in Java to eliminate multiple blanks between the arr by a single blank.
 */
import java.util.Scanner;

class Q8_RemoveSpace{
    String str;
    int len;
    String[] arr;
    String output = "";
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
        arr = str.split(" ");
    }
    void removeSpaces(){
        for(int counter = 0; counter< arr.length; counter++){
            if (arr[counter] != ""){
                output += arr[counter] + " ";
            }
        }
    }
    void display(){
        System.out.println("Correct Sentence: "+ output);
    }
    public static void main(String[] args) {
        Q8_RemoveSpace obj = new Q8_RemoveSpace();
        obj.input();
        obj.removeSpaces();
        obj.display();
    }
}