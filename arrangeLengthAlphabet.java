import java.util.*;

class arrangeLengthAlphabet{
    String str;
    String[] arr;
    int len;
    public static void main(String[] args) {
        arrangeLengthAlphabet ob = new arrangeLengthAlphabet();
        ob.input();
        ob.arrange();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.nextLine().toUpperCase();
        if ((str.charAt(str.length() - 1) == '.') || (str.charAt(str.length() - 1) == '?') ||
                (str.charAt(str.length() - 1) == '!') ) {
            str = str.substring(0, str.length() - 1);
        }
        else {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        StringTokenizer st = new StringTokenizer(str," ");
        len = st.countTokens();
        arr = new String[len];
        int count = 0;
        while (st.hasMoreTokens()){
            arr[count++] = st.nextToken();
        }
    }
    void arrange(){
        String temp = null;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(arr[j].length() > arr[j+1].length()){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    temp = null;
                }
                else if((arr[j].length() == arr[j+1].length()) && arr[j].compareToIgnoreCase(arr[j+1]) > 0){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void display(){
        System.out.println("Original: "+ str);
        System.out.println("Arranged: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLongest Word: "+ arr[len-1] + "\n"+ "Shortest Word: "+ arr[0]);
    }
}