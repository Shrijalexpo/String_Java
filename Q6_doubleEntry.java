/**
 * Write a program in Java to accept two strings. Display the new string by taking each character of
 * the first string from left to right and of the second string from right to left. The letters should
 * be taken alternatively from each string. Assume that the length of both the strings are same.
 */
import java.util.Scanner;
class Q6_doubleEntry {
    int len;
    String out = "";
    String str1,str2;
    public static void main(String[] args) {
        Q6_doubleEntry ob = new Q6_doubleEntry();
        ob.input();
        ob.duoStr();
        ob.display();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word 1: ");
        str1 = sc.nextLine();
        System.out.println("Enter Word 2: ");
        str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.exit(0);
        }
    }
    void duoStr(){
        for (int idx = 0; idx < str1.length(); idx++) {
            char c1 = str1.charAt(idx);
            char c2 = str2.charAt(str1.length() - 1 - idx);
            out = out + c1 + c2;
        }
    }
    void display(){
        System.out.println("Original String: "+str1+" "+str2+ "\n"+ "New String: "+ out);
    }

}