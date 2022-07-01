/**
 * Write a program in Java to accept a string and display the new string after reversing the characters of each word.
 * Sample Input: Understanding Computer Science
 * Sample output: gnidnatsrednU retupmoC ecneicS
 */
import java.util.Scanner;
import java.util.StringTokenizer;

class Q5_ReverseWords {
    int len;
    String[] str;
    public static void main(String[] args) {
        Q5_ReverseWords ob = new Q5_ReverseWords();
        ob.input();
        ob.reverse();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine().strip().split(" ");
        len = str.length;
    }
    void reverse(){
        for(int idx = 0; idx < len; idx ++){
            StringBuffer sb = new StringBuffer(str[idx]);
            sb.reverse();
            System.out.print(sb + " ");
        }
    }
}