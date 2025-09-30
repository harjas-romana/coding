import java.util.Scanner;

public class BeautifulYear {
    public static boolean isBeautifulYear(int year) {

        String str = Integer.toString(year);

        for(int i = 0; i < str.length(); i++) {

            for(int j = i+1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        while(true) {
            year++;

            if(!isBeautifulYear(year)) {
                continue;
            } else {
                System.out.println(year);
                break;
            }
        }
    }
}