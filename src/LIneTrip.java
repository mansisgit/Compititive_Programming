import java.util.Scanner;

public class LIneTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int diff = arr[0];
            for(int i=1;i<n;i++){
               int currdiff = Math.abs(arr[i]-arr[i-1]);
                diff = Math.max(diff,currdiff);
            }

            int double_diff = Math.abs(x - arr[n-1])*2;
            System.out.println(Math.max(diff,double_diff));

        }

    }
}
