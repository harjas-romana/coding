import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WayTooLongWords {
    public static String helper(String word) {
        if(word.length() > 10) {
            return word.charAt(0) + Integer.toString(word.length()-2) + word.charAt(word.length()-1);
        } else {
            return word;
        }
    }

    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++) {
                String word = br.readLine();
                System.out.println(helper(word));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
