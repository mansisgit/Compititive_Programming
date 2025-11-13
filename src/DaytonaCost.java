import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int cost_option1 = n * x;
            int cost_option2 = y;

            System.out.println(Math.min(cost_option1, cost_option2));
        }
    }
}
