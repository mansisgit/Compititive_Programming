import java.util.Scanner;


public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String updatable = sc.next();
            String tobechecked = sc.next();

            String x1 = updatable + updatable;//1 opration
            String x2 = x1 + x1;//2 operations
            String x3 = x2 + x2;//3 operations
            String x4 = x3 + x3;//4 operations
            String x5 = x4 + x4;//5 operations

            int operations = -1;


        }
    }
}
