import java.util.Scanner;

public class UltraFastMath {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String num1 = sc.next();
            String num2 = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < num1.length(); i++) {

                char one = num1.charAt(i);
                char two = num2.charAt(i);

                sb.append(one==two ? '0' : '1');
            }

            System.out.println(sb.toString());
        }
    }
}