import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    public static boolean isValidScore(int score) {
        if(score < 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int positionOfK = sc.nextInt();

        List<Integer> scores = new ArrayList<>();
        
        for(int i=0; i < n; i++) {
            scores.add(sc.nextInt());
        }
        sc.close();

        int result = 0;

        for(int score : scores) {
            if(score >= scores.get(positionOfK-1) && isValidScore(score)) {
                result++;
            }
        }
        System.out.println(result);
    }
}