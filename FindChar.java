import java.util.Scanner;
/**
 * Write a program in java to enter a string in Ascii form and convert it into String in character form ensuring that
 * no special character is displayed and output should be case sensitive.
 */
class FindChar{
    int len;
    String input;
    String out = "";
    public static void main(String[] args) {
        FindChar ob = new FindChar();
        ob.input();
        ob.Find();
        ob.display();
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        input = sc.next();
        len = input.length();
    }
    void Find(){
        int temp;
        for (int idx = 0; idx < len - 2; idx++) {
            temp = Integer.parseInt((input.substring(idx,idx+2)));
            if((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 99) || (temp == 32)){
                out += (char)temp;
            }
            temp = Integer.parseInt((input.substring(idx,idx+3)));
            if (temp >= 100 && temp <= 122){
                out += (char)temp;
            }
        }
    }
    void display(){
        System.out.println("output: "+ out);
    }
}