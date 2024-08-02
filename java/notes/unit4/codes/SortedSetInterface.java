/**
 * -- SortedSet interface --
 * 
 * The SortedSet interface extends Set to handle sorted collections.
 * It provides additional methods for handling a sorted set.
 * 
 * -- methods --
 * 
 * first(): Returns the first (lowest) element.
 * last(): Returns the last (highest) element.
 * headSet(E toElement): Returns a view of the portion of the set.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Cherry");

        System.out.println("SortedSet: " + sortedSet);
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
    }
}
