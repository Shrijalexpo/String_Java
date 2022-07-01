/**
 * Write a program in Java to accept four-letter word. Display all the probable four
 * letter combinations such that no letter should be repeated in the output within each
 * combination.
 */
import java.util.Scanner;
class Q7_PnC {
    int len;
    String str;
    public static void main(String[] args) {
        Q7_PnC ob = new Q7_PnC();
        ob.input();
        ob.PnC();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        str = sc.nextLine();
        len = str.length();
        if (len != 4) {
            System.exit(0);
        }
    }
    void PnC(){
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    for (int l = 0; l < len; l++) {
                        if(i!=j && i != k && i != l && j != k && j != l && k != l){
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.print(str.charAt(k));
                            System.out.println(str.charAt(l));
                        }
                    }
                }
            }
        }
    }
}