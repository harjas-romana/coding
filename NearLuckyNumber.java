import java.util.Scanner;

public class NearLuckyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String number = sc.next();

            int count = 0;
            for(int i = 0; i < number.length(); ++i) {
                char c = number.charAt(i);
                if (c == '4' || c == '7') count++;
            }

            System.out.println((count == 4 || count == 7) ? "YES" : "NO");
        }
    }
}
