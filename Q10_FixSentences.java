import java.util.Scanner;

/**
 * The input in this question will consist of a number of lines of English text consisting of the letters of
 * the English alphabet, the punctuation marks (') apostrophe, (.) full stop() comma, (;) semicolon, (:) colon
 * and white space characters (blank, new line). Your task is to print the words of the text in reverse order
 * without any punctuation marks other than blanks.
 */
class Q10_FixSentences {
    int lineNum;
    String[] lines;
    String[][] words;
    StringBuffer sb;
    public static void main(String[] args) {
        Q10_FixSentences obj = new Q10_FixSentences();
        obj.input();
        obj.fix();
        obj.reverse();
        obj.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines");
        lineNum = Integer.parseInt(sc.nextLine());
        if ( lineNum < 1 ) {
            System.out.println("Invalid no. lines");
            System.exit(0);
        }
        lines = new String[lineNum];
        words = new String[lineNum][100];
        for (int idx = 0; idx < lineNum; idx++) {
            System.out.println("Enter line no. "+ (idx + 1));
            lines[idx] = sc.nextLine();
            words[idx] = lines[idx].strip().split(" ");
        }
    }
    void fix(){
        int count = 0;
        for (int idx = 0; idx < lineNum; idx ++){
            for(int counter = 0; counter < words[idx][count].length(); counter ++){
                if(words[idx][counter].charAt(words[idx][counter].length() - 1) == '\'' || words[idx][counter].charAt(words[idx][counter].length() - 1) == '.'
                        || words[idx][counter].charAt(words[idx][counter].length() - 1) == ',' || words[idx][counter].charAt(words[idx][counter].length() - 1) == ';'){
                    words[idx][counter] = words[idx][counter].substring(0 , words[idx][counter].length() - 1);
                }
            }
            count ++;
        }
    }

    void reverse(){
        int idx;

        for(int count = 0; count < words.length; count ++){
            for (idx = 0; idx < lineNum; idx ++){
                sb = new StringBuffer(words[count][idx]);
                sb.reverse();
            }
            words[count][idx] = sb.toString();
        }
    }
    void display(){
        for (int idx = 0; idx < lines.length; idx++) {
            for (int count = 0; count < words[idx].length; count ++){
                System.out.print(words[idx][count]+" ");
            }
            System.out.println();
        }

    }
}
// Hello, I am A Donut. --> "Hello, I am A Donut.", "A Donut is a Torus."
// A Donut is a Torus.
// Words