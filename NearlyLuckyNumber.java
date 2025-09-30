import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyLuckyNumber {

    public static boolean isnEarlyLuckyNumberHelper(Long number) {

        String n = Long.toString(number);

        int counter = 0;

        for(char c : n.toCharArray()) {
            if(c == '4' || c == '7') {
                counter++;
            }
        }

        return counter == 4 || counter == 7;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        Long number = Long.parseLong(br.readLine());

        if(isnEarlyLuckyNumberHelper(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
