/**
 * -- Hashset --
 * 
 * HashSet is a hash table-based implementation of the Set interface.
 * It does not guarantee the order of elements.
 * 
 * -- Key Characteristics --
 * 
 * Backed by a hash table.
 * Does not allow duplicate elements.
 * Null elements are allowed.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Horse");

        System.out.println("HashSet: " + set);
    }
}
