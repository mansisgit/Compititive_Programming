import java.util.Arrays;
import java.util.Scanner;

public class Doremys_Pain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            if(n==2) System.out.println("Yes");

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }//input taken
            boolean correct = false;
            for(int i=0;i+2<n;i++){
                if(arr[i] == arr[i+2]){
                    correct = true;
                }else {
                    correct = false;
                }
            }
            System.out.println(correct);
        }
    }
}
