/**
 * Prog. 2: Write a program in Java to enter a string in a mixed case.
 * Arrange all the letters of string such that all the lower case characters
 * are followed by the upper case characters.
 * Sample Input: Computer Science Sample Output: omputercienceCS
 */
import java.util.Scanner;
class Q2_FollowLowerUpper{
    String str;
    int len;
    String ans = "", caps = "";
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
    }
    void check(){
        for (int counter = 0; counter < len; counter++) {
            if(str.charAt(counter) != ' ') {
                if (Character.isUpperCase(str.charAt(counter))) {
                    caps += str.charAt(counter);
                } else {
                    ans += str.charAt(counter);
                }
            }
        }
        ans += caps;
    }
    void display(){
        System.out.println("Original Input: "+ str);
        System.out.println("Output: "+ ans);
    }
    public static void main (String[] args){
        Q2_FollowLowerUpper follow = new Q2_FollowLowerUpper();
        follow.input();
        follow.check();
        follow.display();
    }

}