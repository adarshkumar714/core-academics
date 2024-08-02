/**
 * -- Iterator interface --
 * 
 * The Iterator interface provides methods to iterate over a collection of objects.
 * It is used to traverse through a collection, such as a list or set,
 * without exposing the underlying data structure.
 * 
 * -- methods --
 * 
 * hasNext(): Returns true if the iteration has more elements.
 * next(): Returns the next element in the iteration.
 * remove(): Removes the current element in the iteration.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        System.out.println("\n-- Iterator interface --\n");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
