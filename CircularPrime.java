/** A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmostdigit is
 removed and replaced at the end of the remaining string of digits, the generated number is still prime. The
 process is repeated until the original number is reached again.
 A number is said to be prime if it has only two factors 1 and itself.

 131
 311
 113


 number ke number of digits le lo
 and fir loop over the digits
 checking for prime
 if it is prime, take mod 10 and then divide by 10
 then multiply the mod by 10^(no. of digits - 1)
 thats the new number to loop over

 */


import java.util.Scanner;
class CircularPrime{
    int input;
    boolean isCircularPrime = false;
    int len;
    void input(){
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        len = (String.valueOf(input)).length();
    }
    boolean checkPrime(int number){
        for (int factors = 2; factors < number/2; factors ++){
            if (number % factors == 0){
                return false;
            }
        }
        return true;
    }

    //    if it is prime, take mod 10 and then divide by 10
//    then multiply the mod by 10^(no. of digits - 1)
//    thats the new number to loop over
    void checkCircle(){
        int counter;
        int temp = input;
        int digit;
        for (counter = 0; counter < len; counter ++){
            if (checkPrime(temp)){
                digit = temp % 10;  //1
                temp /= 10;         // 13
                temp = temp + digit * (int)Math.pow(10, len - 1); // 13 + 1 * 100 = 113
            }
            else{
                break;
            }
        }
        if (counter == len){
            isCircularPrime = true;
        }

    }
    void display(){
        if (isCircularPrime){
            System.out.println("Circular Prime: " + input);
        }
    }
    public static void main(String[] args) {
        CircularPrime circle = new CircularPrime();
        circle.input();
        circle.checkCircle();
        circle.display();
    }
}
// Created by Vedant Kesarwani (Co-Founder of Le Koders)