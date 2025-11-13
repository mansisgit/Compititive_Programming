import java.util.Scanner;


public class DontTryToCount {

    public static boolean cheks(String updatable, String tobechecked){
        //return updatable.contains(tobechecked);
        if(updatable.length()<tobechecked.length()) return false;
        //agar updatable chota hai to false kyunki ussko update karne ki jarurat hai
        for(int i=0;i<updatable.length()-tobechecked.length()+1;i++){
            //window ka size tobechecked ka size hai
            //par difference +1 liya hai kyunki window baki ke bache huye lengthy pe searching nh kr skta
            //  updatable = abcccffefff --> length = 11 form index 0 to 10
            // tobechecked = cff  --> length = 3 form index 0 to 2
            //diff = 11-3 = 8 toh 9 aur 10 index pe window start nh ho skta so i will be till 8 only
            //i is starting point of the window
            if(updatable.substring(i,tobechecked.length()).equals(tobechecked)){
                //substring function ka second parameter exclusive hota hai --> (i,3) means i to 2
                //toh i se 2 tak ka substring nikal ke compare karenge
                // updatable = abcccffefff --> substring(i,3)--> abc when i=0
                //when i=1 ,substring(i,3)--> bcc -->start at i=1 then count 3 characters form there-->b(1)c)(2)c(3)-->bcc
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String updatable = sc.next();
            String tobechecked = sc.next();

            String x1 = updatable + updatable;//1 opration
            String x2 = x1 + x1;//2 operations
            String x3 = x2 + x2;//3 operations
            String x4 = x3 + x3;//4 operations
            String x5 = x4 + x4;//5 operations

            int operations=-1;

            if(cheks(updatable,tobechecked)){
                operations = 0;
            } else if(cheks(x1,tobechecked)){
                operations = 1;
            } else if(cheks(x2,tobechecked)){
                operations = 2;
            } else if(cheks(x3,tobechecked)){
                operations = 3;
            } else if(cheks(x4,tobechecked)){
                operations = 4;
            } else if(cheks(x5,tobechecked)){
                operations = 5;
            }
            System.out.println(operations);

        }
    }
}

