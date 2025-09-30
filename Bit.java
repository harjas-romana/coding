import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String operation = sc.next();

            if(operation.equals("++X")) {
                ++X;
            } else if (operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X")) {
                X--;
            } else if (operation.equals("X--")) {
                --X;
            }
        }
        System.out.println(X);
        sc.close();
    }
}
