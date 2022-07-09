import java.util.Scanner;
class encoding{
    String sent, out = "", copy;
    String[] words;
    int k;
    public static void main(String[] args) {
        encoding ob = new encoding();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str = sc.nextLine();
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        ob.input(str,n);
        ob.encode();
        ob.display();
    }
    void input(String str, int n){
        copy = str;
        sent = str.toLowerCase().trim();
        words = sent.split(" ");
        k = n-1;
    }
    void encode(){
        int temp;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                temp = (int)words[i].charAt(j);
                for (int l = 0; l < k; l++) {
                    if((temp == 122) && Character.isLetter((char)temp)){
                        temp = 97;
                    }
                    if((temp == 57) && Character.isDigit((char)temp)){
                        temp = 48;
                    }
                    temp++;
                }
                out += (char)temp;
            }
            out += " ";
        }
    }
    void display(){
        for (int i = 0; i < copy.length(); i++) {
            if(Character.isUpperCase(copy.charAt(i)) && copy.charAt(i) != ' ' ){
                System.out.print(Character.toUpperCase(out.charAt(i)));
            }
            else{
                System.out.print(out.charAt(i));
            }
        }
    }
}