import java.util.Scanner;

public class Sample {
    public static int division(int a,int b)  {

        try{
            int result = a/b;
            System.out.println("try block");
            return result;//1] first finally will execute then return statement
        }catch (Exception e){
           System.out.println("exception");
        }
        finally
        {
            System.out.println("fianlly block");

        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Sample obj = new Sample();//same block of class no need of obj
        System.out.println(division(a,b));
    }
}
