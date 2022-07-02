/**
 * A new advanced Operating System, incorporating the latest hi-tech features has been designed by Opera Computer Systems.
 * The task of generating copy protection code to prevent software privacy has been entrusted to the Security Department.
 * The Security Department has decided to have codes containing a jumbled combination of alternate
 * uppercase letters of the alphabet starting from A up to K (namely among A, C, E, G, I, K).
 * The code may or may not be in the consecutive series of alphabets.
 * Each code should not exceed 6 characters and there should be no repetition of characters. If it exceeds 6 characters,
 * display an appropriate error message.
 * Write a program to input a code and its length. At the first instance of an error display "Invalid"
 * stating the appropriate reason. In case of no error, display the message "Valid".
 */
import java.util.Scanner;

class Q9_SecureCode{
    String str;
    int len, n;
    char[] arr = {'A', 'C', 'E', 'G', 'I', 'K'};
    String output = "";
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        n = sc.nextInt();
        if(n < 1 || n > 6){
            System.out.println("Error! Length of String should not exceed 6 characters!");
            System.exit(0);
        }
        System.out.println("Enter code: ");
        str = sc.next();
        for(int idx = 0; idx < str.length(); idx ++){
            if (!Character.isUpperCase(str.charAt(idx))){
                System.out.println("Invalid! Only uppercase letters permitted!");
                System.exit(0);
            }
        }

    }
    void checkAlternate(){
        int temp = 0;
        for(int idx = 0; idx < str.length(); idx ++){
            for (int count = 0; count < 6; count ++){
                if (str.charAt(idx) == arr[count]){
                    System.out.println(temp);
                    temp ++;
                    remove(arr, count);
                    break;
                }
            }

        }
        if (temp != n){
            System.out.println("Invalid! Only alternate characters allowed!");
            System.exit(0);
        }
    }
    void remove(char[] arr, int idx){
        for (int counter = idx; counter < arr.length - 1; counter++) {
            arr[counter] = arr[counter+1];
        }
    }
    void display(){
        System.out.println("Valid");
    }
    public static void main(String[] args) {
        Q9_SecureCode obj = new Q9_SecureCode();
        obj.input();
        obj.checkAlternate();
        obj.display();
    }
}