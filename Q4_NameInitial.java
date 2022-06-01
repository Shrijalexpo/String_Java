/**
 * Write a program in Java to accept a name containing three words
 * and display the name in short form with the initials.
 * Sample Input: MAHINDER SINGH DHONI
 * Sample Output: M.S. DHONI
 */
import java.util.Scanner;
class Q4_NameInitial{
    String str;
    int len;
    String initials = "";
    String[] words;
    public static void main(String[] args) {
        Q4_NameInitial obj = new Q4_NameInitial();
        obj.input();
        obj.rename();
        obj.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
        words = str.split(" ");
    }
    void rename(){
        for(int counter = 0; counter< words.length -1;counter ++){
            initials += words[counter].charAt(0)+ ". ";
        }
        initials += words[words.length - 1];
    }
    void display(){
        System.out.println("Original name: "+str +"\n"+"Final name: "+initials);
    }
}