import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] presses = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                presses[i][j] = sc.nextInt();
        
        int[][] dirs = {{0,0},{0,1},{0,-1},{1,0},{-1,0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int[] d : dirs) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3)
                        sum += presses[ni][nj];
                }
                System.out.print((sum % 2 == 0 ? 1 : 0));
            }
            System.out.println();
        }
    }
}
