/**
 * -- ArrayList --
 * 
 * ArrayList is a resizable array implementation of the List interface.
 * It provides fast random access and dynamic resizing but can
 * be slower for insertions and deletions in the middle of the list.
 * 
 * -- Key Characteristics --
 * Backed by an array.
 * Allows null elements.
 * Synchronized access is not supported.
 * 
 */

package notes.unit4.codes;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        System.out.println("\n-- ArrayList --\n");
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("ArrayList: " + list);
    }
}


