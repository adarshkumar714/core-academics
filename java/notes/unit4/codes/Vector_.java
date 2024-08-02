/**
 * -- Vector --
 * 
 * Vector is a legacy class that implements a dynamic array with synchronized access.
 * It is similar to ArrayList but is synchronized.
 * 
 * -- Key Characteristics --
 * 
 * Thread-safe due to synchronization.
 * Older and less preferred compared to ArrayList.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4.codes;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Vector: " + vector);
    }
}
