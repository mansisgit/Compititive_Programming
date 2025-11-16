import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        boolean found_zero = false;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                found_zero = true;
            }
            min = Math.min(arr[i],min);
        }


    }
}
