/**
 * Write a program in Java to accept a string. Count and display the frequency of each character present in the string.
 * The character with multiple frequencies should be displayed only once.
 * Sample Input: golden jubilee
 * Sample Output:
 */
import java.util.Scanner;
class Q4_Frequency{
    String str;
    int len;
    char[] arr;
    public static void main(String[] args) {
        Q4_Frequency ob = new Q4_Frequency();
        ob.input();
        ob.sort(ob.arr);
        ob.hasFrequency();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine().strip();
        len = str.length();
        arr = new char[len];
        for (int idx = 0; idx < len; idx++){
            if (str.charAt(idx) != ' '){
                arr[idx] = str.charAt(idx);
            }
        }
    }
    void sort(char[] arr){
        int i, j;
        char temp;
        int len = arr.length;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - i - 1; j ++){
                if(arr[j]>arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void hasFrequency() {
        int count = 1;
        int n = 1;
        while (n + 1 < arr.length) {
            if (arr[n - 1] == arr[n]) {
                count++;
            } else {
                System.out.println(arr[n] + "\t" + count);
                count = 1;
            }
            n ++;
        }
        System.out.println(arr[arr.length-1] + "\t" + count);
    }
}
