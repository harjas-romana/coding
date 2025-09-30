import java.util.*;

public class AllLengthsSubtraction {

    public static boolean checkSequence(int[] p, boolean ascending) {
        int n = p.length;
        int start = -1;
        for (int i = 0; i < n; i++) {
            if (p[i] == 1) {
                start = i;
                break;
            }
        }
        if (start == -1) return false;

        for (int i = 0; i < n; i++) {
            int expected = ascending ? (i + 1) : (n - i);
            if (p[(start + i) % n] != expected) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            boolean ok = checkSequence(p, true) || checkSequence(p, false);
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
