import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Doremys_Pain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){//n time complexity
                arr[i] = sc.nextInt();

            }//input taken

            HashMap<Long,Long> frequency = new HashMap<>();//o(nlogn)
            for(int ele: arr){
                  frequency.put((long) ele,frequency.getOrDefault((long) ele,0L)+1);

            }
            if(frequency.keySet().size()>=3){
                System.out.println("No");
                continue;
            }

            if(frequency.keySet().size()==1){
                System.out.println("Yes");
                continue;
            }

            ArrayList <Long> values = new ArrayList<>(frequency.values());
            long val1 = values.get(0);
            long val2 = values.get(1);

            if(Math.abs(val1-val2)<=1) System.out.println("Yes");
            else System.out.println("No");

//time complexity jo sabse jyada wohi hoti hai
            //space complexity add up hoti hai --->
        }
    }
}
