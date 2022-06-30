/**A string is given as:
 * Purity of Mind is Essential
 * Write a program in Java to enter the string. Count and display:
 * (a) the character with lowest ASCII code in lower case
 * (b) the character with highest ASCII code in lower case
 * (c) the character with lowest ASCII code in upper case
 * (d) the character with highest ASCII code in upper case
 */
import java.util.Scanner;
class Q1_CountUpperLower{
    String str;
    int len;
    char lowest_small = '{' ,lowest_capital = '[', highest_small = '\'', highest_capital = '@';
    int[] frequency = new int[4];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = sc.nextLine();
        len = str.length();
    }
    void check(){
        for(int counter = 0; counter < len; counter++){
            if(Character.isUpperCase(str.charAt(counter))){
                if(str.charAt(counter) < (lowest_capital)){
                    lowest_capital = str.charAt(counter);
                } else if (str.charAt(counter) > (highest_capital)){
                    highest_capital = str.charAt(counter);
                }
            }
            else if(Character.isLowerCase(str.charAt(counter))){
                if(str.charAt(counter) < (lowest_small)){
                    lowest_small = str.charAt(counter);
                } else if (str.charAt(counter) > (highest_small)){
                    highest_small = str.charAt(counter);
                }
            }
        }
    }
    void count(){
        for(int counter = 0; counter < len; counter ++){
            if(str.charAt(counter) == lowest_small){
                frequency[0] ++;
            } else if (str.charAt(counter) == highest_small) {
                frequency[1] ++;
            } else if (str.charAt(counter) == lowest_capital){
                frequency[2] ++;
            } else if (str.charAt(counter) == highest_capital) {
                frequency[3]++;
            }
        }
    }
    void display(){
        System.out.println("Lowest Small Letter " + lowest_small + ": " + frequency[0]);
        System.out.println("Highest Small Letter " + highest_small + ": " + frequency[1]);
        System.out.println("Lowest Capital Letter " + lowest_capital + ": " + frequency[2]);
        System.out.println("Highest Capital Letter " + highest_capital + ": " + frequency[3]);
    }
    public static void main(String[] Args) {
        Q1_CountUpperLower ob = new Q1_CountUpperLower();
        ob.input();
        ob.check();
        ob.count();
        ob.display();
    }
}
