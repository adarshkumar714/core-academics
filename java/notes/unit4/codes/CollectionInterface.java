/**
 * -- Collection interface --
 * 
 * The Collection interface is the root of the collection hierarchy in Java.
 * It represents a group of objects, known as elements,
 * and provides basic operations such as adding, removing, and checking the size of the collection.
 * 
 * -- methods --
 * 
 * add(E e): Adds an element.
 * remove(Object o): Removes an element.
 * size(): Returns the number of elements.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {
        System.out.println("\n-- Collection interface --\n");
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("Python");
        collection.add("JavaScript");

        for (String language : collection) {
            System.out.println(language);
        }
    }
}