import java.util.Arrays;
import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int boxes = sc.nextInt();
            int maxreverselength = sc.nextInt();
            int[] arr = new int[boxes];
            for(int i=0;i<boxes;i++){
                arr[i] = sc.nextInt();
            }
            int[] sorted = Arrays.copyOf(arr,boxes);
            Arrays.sort(sorted);
            if(Arrays.equals(arr,sorted)){
                System.out.println("YES");
            }else {
                if(maxreverselength==1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

        sc.close();
    }
}
