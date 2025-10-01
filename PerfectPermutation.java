import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectPermutation {

    private static void generatePermutation(List<Integer> A, int num) {
        for(int i = 1; i <= num; i++) {
            A.add(i);
        }
    }

    private static void swap(List<Integer> A, int a, int b) {
        int temp = A.get(a);
        A.set(a, A.get(b));
        A.set(b, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println(-1);
            return;
        }

        List<Integer> nums = new ArrayList<>();
        generatePermutation(nums, num);

        for(int i = 0; i < nums.size(); i += 2) {
            swap(nums, i, i + 1);
        }

        for(int val : nums) {
            System.out.print(val + " ");
        }
    }
}
