import java.util.*;
class Q14_Reverse{
    String str;
    StringBuffer sb;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine();
    }
    void reverse(){
        sb = new StringBuffer(str);
        sb.reverse();
    }
    void display(){
        System.out.print("Output: "+ sb);
    }
    public static void main(String[] Args){
        Q14_Reverse rev = new Q14_Reverse();
        rev.input();
        rev.reverse();
        rev.display();
    }
}