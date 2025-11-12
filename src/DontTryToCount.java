import java.util.Scanner;


public class DontTryToCount {

    public static boolean cheks(String updatable, String tobechecked){
        //return updatable.contains(tobechecked);
        if(updatable.length()<tobechecked.length()) return false;
        for(int i=0;i<updatable.length()-tobechecked.length()+1;i++){
            if(updatable.substring(i,tobechecked.length()+1).equals(tobechecked)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
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

