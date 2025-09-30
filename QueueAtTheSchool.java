import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();
        int timeSeconds = sc.nextInt();

        String queueString = sc.next();

        for(int i = 0; i < timeSeconds; i++) {
            queueString = queueString.replace("BG", "GB");
        }

        System.out.println(queueString);
    }
}