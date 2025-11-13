import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == k) {
                    System.out.println("YES");
                } else {
                    if(i==n-1)
                    System.out.println("NO");
                }
            }//input taken


        }
    }
}
