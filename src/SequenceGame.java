import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int length = sc.nextInt();
            int [] a = new int[length];
            for(int i=0;i<length;i++){
                a[i] = sc.nextInt();
            }

            //input taken
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a[0]);

            for(int i=1;i<a.length;i++){
                if(a[i-1]<=a[i]) b.add(a[i]);
            }

            System.out.println(b);
        }
    }
}
