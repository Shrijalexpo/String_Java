import java.util.Scanner;

class SmithNo {
    String num;
    int sum = 0;
    int Sumfac = 0;
    int[] factors;
    public static void main(String[] args) {
        SmithNo ob = new SmithNo();
        ob.input();
        ob.Sum();
        ob.Factors();
        ob.check();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        num = sc.next();
        factors = new int[Integer.parseInt(num)];
    }
    void Sum(){
        int number = Integer.parseInt(num);
        while (number > 0) {
            sum += number%10;
            number = number/10;
        }
    }
    boolean isprime(int x){
        int count = 0;
        for (int i = 2; i < x/2+1; i++) {
            if(x% i == 0){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
    void Factors(){
        int number = Integer.parseInt(num);
        int i, count = 0;
        for(i = 2; i< number; i++) {
            if(isprime(i)){
                while(number%i == 0) {
                    factors[count] = i;
                    number = number/i;
                    count++;
                }
            }
        }
        if(number >2) {
            factors[count+1] = number;
        }
        System.out.print("Factors are: ");
        for (int j = 0; j < factors.length; j++) {
            if (factors[j] != 0) {
                System.out.print(factors[j] + "\t");
            }
        }
        System.out.println();
    }
    void check(){
        int temp;
        for (int i = 0; i < factors.length; i++) {
            temp = factors[i] ;
            while (temp != 0) {
                Sumfac += temp %10;
                temp = temp / 10;
            }
        }
    }
    void display(){
        System.out.println("Sum of digits: "+ sum);
        System.out.println("Sum of factors: "+ Sumfac);
        if(Sumfac == sum){
            System.out.println(num+" is a Smith number");
        }
        else{
            System.out.println(num+" is not a Smith number");
        }
    }
}