/**
 * -- LinkedHashSet --
 * 
 * LinkedHashSet is a hash table and linked list implementation of the Set interface,
 * which maintains insertion order.
 * 
 * -- Key Characteristics --
 * 
 * Maintains insertion order.
 * Backed by a hash table and a linked list.
 * Null elements are allowed.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.LinkedHashSet;

public class LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        System.out.println("LinkedHashSet: " + set);
    }
}
