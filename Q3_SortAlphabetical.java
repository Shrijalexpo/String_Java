/**
 *Prog. 3: Write a program in Java to accept a string. Arrange all the letters of the string in an alphabetical order.
 * Now, insert the missing letters in the sorted string to complete all the letters between first and last characters
 * of the string.
 * Sample Input: computer
 * Alphabetical order: cemoprtu
 * Sample Output: cdefghijklmnopqrstu
 */
import java.util.Arrays;
import java.util.Scanner;
class Q3_SortAlphabetical{
    String str;
    int len;
    char[] arr;
    String out = "", nstr = "";
    public static void main(String[] args) {
        Q3_SortAlphabetical ob = new Q3_SortAlphabetical();
        ob.input();
        ob.sort();
        ob.addCharacter();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
        arr = new char[len];
        for(int idx = 0; idx < len; idx ++){
            arr[idx] = str.charAt(idx);
        }
    }
    void sort(){
        int i, j;
        char key;
        for(i = 1; i < len; i ++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
    }
    void display(){
        for(int idx = 0; idx < arr.length; idx ++){
            nstr += arr[idx];
        }
        System.out.println("Alphabetical order:" + nstr);
        System.out.println("Output: "+ out);
    }
    void addCharacter(){
        for (int counter = 0; counter < arr.length-1; counter++) {
            out += arr[counter];
            for(int idx = (int)arr[counter] + 1; idx < (int)arr[counter+1]; idx ++){
                out += (char)idx;
            }
        }
        out += arr[arr.length-1];
    }
}