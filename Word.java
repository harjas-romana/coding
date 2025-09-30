import java.util.Scanner;

public class Word {

    public static boolean isLowerCase(char x) {
        return Character.isLowerCase(x);
    }

    public static void isMoreThanHalf(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (isLowerCase(c)) {
                count++;
            }
        }

        if (count >= (str.length() + 1) / 2) {
    System.out.println(str.toLowerCase());
} else {
    System.out.println(str.toUpperCase());
}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        isMoreThanHalf(str);
    }
}

