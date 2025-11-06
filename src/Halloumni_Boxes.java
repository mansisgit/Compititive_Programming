import java.util.Scanner;

public class Halloumni_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean unsortedfound = false;

            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
                if(i>0 && arr[i-1]>arr[i]) unsortedfound = true;
            }
            if(unsortedfound){
                if(k==1) System.out.println("NO");
                else System.out.println("YES");
            } else {
                System.out.println("YES");
            }

        }

    }
}