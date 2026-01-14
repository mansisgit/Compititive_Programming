import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
         //LIFO--> Last In First Out
         //push,pop,top,peek

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.peek();
        stack.empty();

        System.out.println(stack.search(10));

    }
}
