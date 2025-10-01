public class StonesOnTable {
    public static boolean isNotSame(char a, char b) {
        return a != b;
    }

    public static int countStonesToRemove(String stones) {

        int count = 0;

        for(int i = 1; i < stones.length(); ++i) {

            if(isNotSame(stones.charAt(i), stones.charAt(i-1))) {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int numberOfStones = sc.nextInt();
        String stones = sc.next();
        System.out.println(countStonesToRemove(stones));
    }
}
