import java.util.Scanner;

public class Borze {

    public static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == '.') {
                sb.append('0');
                i++;
            } else if (s.charAt(i) == '-') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == '.') {
                        sb.append('1');
                        i += 2;
                    } else if (s.charAt(i + 1) == '-') {
                        sb.append('2');
                        i += 2;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            String decoded = decode(str);
            System.out.println(decoded);
        }
    }
}
