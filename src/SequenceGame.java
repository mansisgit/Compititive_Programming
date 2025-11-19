import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int length = sc.nextInt();
            int[] b = new int[length];
            for (int i = 0; i < length; i++) {
                b[i] = sc.nextInt();
            }

            //input taken
            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);//first number is added

            for (int i = 1; i < length; i++) {
                if (b[i - 1] < b[i]) {
                    a.add(b[i]);
                } else {
                    a.add(b[i]);

                }

            }
            System.out.println(Arrays.toString(a.toArray()));

        }
    }
}
