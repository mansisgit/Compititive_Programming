import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            items.add(sc.next());
        }
        System.out.println(items.get(0) + " " + items.get(2));
        items.set(1, sc.next());
        items.remove(3);
        items.add(sc.next());
        System.out.println("the final list is:");

        String res = Arrays.toString(items.toArray());
        System.out.println(res);
        String obj = "o";
        String s1 = items.get(items.indexOf(obj));
        System.out.println(items.remove(obj));
    }
    //list<>() and arraylist,>() onj diff
}
