import java.io.*;
public class Inputs {
    public static void main(String[] arr) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        String[] arra = s.split(" ");
        int n1 = Integer.parseInt(arra[0]);
        int n2 = Integer.parseInt(arra[1]);
        int sum = n2+n1;
        System.out.println(sum);
    }
}
