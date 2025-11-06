import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-->0){
            int cells = sc.nextInt();
            String s = sc.next();
            int count=0;
            if(s.charAt(0) == '.') count=1;
            else count =0;

            for(int i=2;i<cells;i++){
                if(s.charAt(i-1) == s.charAt(i) && s.charAt(i) =='.'){
                    count++;
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
