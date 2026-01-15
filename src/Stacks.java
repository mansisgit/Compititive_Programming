import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Collections;

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
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());

        PriorityQueue<Integer> minpq = new PriorityQueue<Integer>();//by default minpriority
        PriorityQueue<Integer> maxpq = new PriorityQueue<Integer>(Collections.reverseOrder());


    }

}
