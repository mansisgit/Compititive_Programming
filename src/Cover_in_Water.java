import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-->0){
            int cells = sc.nextInt();
            String s = sc.next();
            int count=0;

            for(int i=0;i<cells;i++){
                if(s.charAt(i)=='.') {
                    if ( i+2<cells && s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i + 2)) {
                        count = 2;
                        break;
                    } else {
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
