// Write a program in java to enter a word and convert it into pig-latin form
import java.util.*;     //q567
class PigLatin {
    String str;
    int l;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        str = sc.next();
        l = str.length();
    }

    void toPigLatin(){
        char ch;
        for(int i=0;i<l;i++){
            ch = str.charAt(0);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                break;
            }
            else{
                str = str.substring(1)+ch;
            }
        }
        System.out.println(str+"ay");
    }
    public static void main(String[] args) {
        PigLatin obj = new PigLatin();
        obj.input();
        obj.toPigLatin();
    }
}
