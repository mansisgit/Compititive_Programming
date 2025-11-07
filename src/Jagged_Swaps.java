import java.util.Arrays;
import java.util.Scanner;

public class Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int ele = sc.nextInt();
                if(ele>=1 && ele<=n){
                    arr[i] = ele;
                }
            }//input taken
            if(arr[0] == 1) {
                    System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
    }
}
