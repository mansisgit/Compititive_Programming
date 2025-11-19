import java.util.ArrayList;
import java.util.Scanner;

public class United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int length = sc.nextInt();
            int[] arr_a = new int[length];
            for(int i =0;i<length;i++){
                arr_a[i] = sc.nextInt();
            }//input taken

            ArrayList<Integer> arr_b = new ArrayList<>();
            ArrayList<Integer> arr_c = new ArrayList<>();
            arr_b.add(arr_a[0]);//first element added

            for(int i=1;i<length;i++){
                if(arr_a[i-1] % arr_a[i] || arr_a[i] % arr_a[i-1])
            }
        }
    }
}
