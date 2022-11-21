
import java.util.Scanner;

class Decode {
    String dec = "";
    String s;
    int l, shift;

    public static void main(String args[]) {
        Decode ob = new Decode();
        ob.input();
        ob.decript();
        ob.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Coded Text: "); // inputting coded text
        s = sc.nextLine();
        l = s.length();
        s = s.toUpperCase(); // converting the coded text into Uppercase
        s = s + " "; // adding a space at the end
        if (l >= 100) // checking whether length of inputted code is less than 100
            System.out.println("Invalid Length of Coded Text !!!");

        else {

            System.out.print("Enter the Shift Value : ");
            shift = sc.nextInt();
            if (shift < 1 || shift > 26) // checking whether shift value is between 1 and 26
                System.out.println("Invalid Shift Value !!!");

        }
    }

    void decript() {
        int a, b;
        char ch1, ch2;
        //new String for storing the decoded text
        for(
                int i = 0;
                i<l;i++)

        {
            ch1 = s.charAt(i);
            ch2 = s.charAt(i + 1);
            a = ch1 + shift - 1;
            b = ch2 + shift - 1;
            if ((char) a == 'Q' && (char) b == 'Q') {
                a = 32;
                i++;
            }

            if (a > 90)
                a = a - 26;
            if (ch1 != ' ')
                dec += (char) a; // finally adding the decoded character to the new String

        }
    }

    void display(){
        System.out.println("decoded Text:" + dec);

    }
}





