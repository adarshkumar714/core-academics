/**
 * -- List interface --
 * 
 * The List interface extends the Collection interface and represents an
 * ordered collection that allows duplicate elements.
 * It provides positional access and manipulation methods.
 * 
 * -- methods --
 * 
 * get(int index): Retrieves an element at a specific index.
 * set(int index, E element): Replaces the element at a specific index.
 * add(int index, E element): Inserts an element at a specific index.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4;

import java.util.List;
import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        System.out.println("\n-- List interface --\n");
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, "Updated");
        System.out.println("Updated element at index 1: " + list.get(1));
    }
}

