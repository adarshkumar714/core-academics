/**
 * -- Queue interface --
 * 
 * The Queue interface represents a collection designed for holding elements prior to processing.
 * It supports FIFO (first-in, first-out) operations.
 * 
 * -- methods --
 * 
 * offer(E e): Adds an element.
 * poll(): Retrieves and removes the head element.
 * peek(): Retrieves but does not remove the head element.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}

