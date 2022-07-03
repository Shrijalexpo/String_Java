/**
 * Write a program (Using Scanner Class) to enter a token / word in a mixed case and display the new token after
 * deleting all the vowels. Finally arrange the new token in alphabetical order of letters.
 * Sample Input: Computer
 * Sample Output: Cmptr
 * Final Output: Cmprt
 */

import java.util.*;
class RemoveVowel{
    String str, output = "";
    int len;
    char[] words;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().trim();
        len = str.length();
    }
    void removeVowel(){
        for(int idx = 0; idx < len; idx ++){
            char temp = str.charAt(idx);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ||
                    temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U'){
                continue;
            }
            else {
                output += temp;
            }
        }
        len = output.length();
        words = new char[len];
        for (int idx = 0; idx < len; idx++) {
            words[idx] = output.charAt(idx);
        }

    }
    void sort(){
        int i, j;
        char temp;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - i - 1; j ++){
                if(words[j] > words[j + 1]){
                    temp = words[j + 1];
                    words[j + 1] = words[j];
                    words[j] = temp;
                }
            }
        }
    }

    void display(){
        System.out.println("Sample Output: " + output);
        System.out.print("Final Output: ");
        for (int idx = 0; idx < len; idx ++){

            System.out.print(words[idx]);
        }
    }

    public static void main(String[] args) {
        RemoveVowel ob = new RemoveVowel();
        ob.input();
        ob.removeVowel();
        ob.sort();
        ob.display();
    }

}