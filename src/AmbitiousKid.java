import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];


        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
            arr[i]= Math.abs(arr[i]);
        }
        //input taken

       int min = arr[0];
        for(int ele : arr){
            min = Math.min(ele,min);
        }

        System.out.println(min);
    }
}
