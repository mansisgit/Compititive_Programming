import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Inputs {
    public static void main(String[] arr) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        String[] arra = s.split(" ");
        int n1 = Integer.parseInt(arra[0]);
        int n2 = Integer.parseInt(arra[1]);
        int sum = n2+n1;
        System.out.println(sum);

        HashSet<Integer> set = new HashSet<>();

        boolean added = set.add(5);
        System.out.println(added);
        boolean added1 = set.add(5);
        System.out.println(added1);
    }
}
