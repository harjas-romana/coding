import java.util.Scanner;

public class Pan {
    public static boolean isPrime(int num) {

       if(num < 2) return false;
       if(num == 2) return true;
       if(num % 2 == 0) return false;
       
       for(int i=3;i*i<=num;i+=2) {
        if(num%i == 0) return false;
       }
       return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int nextPrime = -1;

        for(int i = number1+1; ;i++) {

            if(isPrime(i)) {
                nextPrime = i;
                break;
            }
        }

        if(nextPrime == number2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}