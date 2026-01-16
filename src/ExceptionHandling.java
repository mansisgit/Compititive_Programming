import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{

            int a=2,b=0;
            int c = a/b;

        }catch (Exception e1){
            System.out.println("devided by zero");
        }

        try{
            int[] arr = {1,2,3};
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i+1]);
            }
        }
        catch (Exception e){
            System.out.println("ArrayIndexOutOfBound!!!");
        }
        try{
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            System.out.println(s);
        }catch (Exception e){
            System.out.println("InputMisMatch");
        }
    }
}
