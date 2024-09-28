/**
 * -- Set interface --
 * 
 * The Set interface represents a collection that does not allow duplicate elements.
 * It is a subinterface of Collection.
 * 
 * -- methods --
 * 
 * Inherits methods from Collection (e.g., add, remove).
 * 
 */

package notes.unit4.codes;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println("Set: " + set);
    }
}
