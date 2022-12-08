import java.util.Scanner;
import java.util.StringTokenizer;

/**
 Write a program to accept a paragraph containing two sentences only. The sentences may be terminated by either '.','?'
 or '!' only. Any other character may be ignored. The words are to be separated by a single blank space and are in UPPER
 CASE Perform the following tasks:

 a) Accept the paragraph and check for validity.
 b) Obtain the length/size of the two sentences separately number of words
 c) Find the common words which occur in both the sentences
 **/

class VerifyParagraph {
    String str;
    String sent_1,sent_2;
    String[] arr;
    public static void main(String[] args) {
        VerifyParagraph ob = new VerifyParagraph();
        ob.input();
        ob.common();
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Paragraph: ");
        str = sc.nextLine().toUpperCase();
        if(isValid()){
            System.out.println("The entered paragraph is Valid");
            StringTokenizer st1 = new StringTokenizer(sent_1," ");
            System.out.println("Sentence 1: "+st1.countTokens()+" words");
            arr = new String[st1.countTokens()];
            int count=0;
            while (st1.hasMoreTokens()){
                arr[count++] = st1.nextToken();
            }
            StringTokenizer st2 = new StringTokenizer(sent_2," ");
            System.out.println("Sentence 2: "+st2.countTokens()+" words");

        }
        else{
            System.out.println("The entered paragraph is not Valid");
            System.exit(0);
        }
    }

    boolean isValid(){
        int count= 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '?' || str.charAt(i) == '.' || str.charAt(i) == '!'){
                count++;
                if(count == 1){
                    sent_1 = str.substring(0,i);
                    temp = i;
                }
                else if(count == 2){
                    sent_2 = str.substring(temp+1,i);
                }
            }
        }
        if (count != 2){
            return false;
        }
        return true;
    }

    void common(){
        System.out.print("Common Words: ");
        for (int i = 0; i < arr.length; i++) {
            if(sent_2.contains(arr[i])){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}