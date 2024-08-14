/**
 * -- TreeSet --
 * 
 * TreeSet is an implementation of the SortedSet interface that uses
 * a red-black tree to store elements in a sorted order.
 * 
 * -- Key Characteristics --
 * 
 * Elements are sorted.
 * Does not allow duplicate elements.
 * Null elements are not allowed.
 * 
 */

package notes.unit4.codes;

import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Alpha");
        set.add("Gamma");
        set.add("Beta");

        System.out.println("TreeSet: " + set);
    }
}
