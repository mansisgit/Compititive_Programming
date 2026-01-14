import java.util.ArrayList;
public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(16);

        list.add(45);
        list.add(18);
        list.add(85);
        list.remove(1);

        list.get(0);
        System.out.println(list.indexOf(18));
        System.out.println(list.remove(1));

    }
}
