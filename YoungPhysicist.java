import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfForces = sc.nextInt();

        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;

        for(int i = 0; i < numberOfForces; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if(sumX + sumY + sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
