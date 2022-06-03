class Q13_PigLatin{
    String str;
    int len;
    String[] words;
    String output = "";
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        str = sc.nextLine().toUpperCase();
        words = str.split(" ");
        len = words.length;
    }
    void toPigLatin(){
        for(int counter = 0; counter < len; counter ++){
            output += convert(words[counter]) + " ";
        }
    }
    String convert(String word){
        char alphabet;
        for(int counter = 0; counter < word.length(); counter ++){
            alphabet = word.charAt(0);
            if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
                break;
            }
            else{
                word = word.substring(1) + alphabet;
            }
        }
        return word += "AY";
    }
    void display(){
        System.out.print("Output: "+ output);
    }
    public static void main(String[] Args){
        Q13_PigLatin pig = new Q13_PigLatin();
        pig.input();
        pig.toPigLatin();
        pig.display();
    }
}