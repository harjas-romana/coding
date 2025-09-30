import java.util.Scanner;

public class Pe {
    public static int compareHelper(String a, String b) {
        if(a.compareTo(b) < 0) {
            return -1;
        } else if (a.compareTo(b) > 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(compareHelper(str1, str2));

        sc.close();
    }
}
