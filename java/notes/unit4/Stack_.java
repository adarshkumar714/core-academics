/**
 * -- Stack --
 * 
 * Stack is a subclass of Vector that represents a last-in, first-out (LIFO) stack of objects.
 * 
 * -- methods --
 * 
 * push(E item): Pushes an item onto the stack.
 * pop(): Removes and returns the top item.
 * peek(): Returns the top item without removing it.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
