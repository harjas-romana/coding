import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        int oneRow = 0;
        int oneCol = 0;

        for(int i = 0 ; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        int movesNeeded = Math.abs(oneRow-2) + Math.abs(oneCol-2);
        System.out.println(movesNeeded);
        sc.close();
    }
}