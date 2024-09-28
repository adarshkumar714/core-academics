/**
 * -- Map interface --
 * 
 * The Map interface represents a collection of key-value pairs.
 * It does not extend Collection and provides methods for mapping keys to values.
 * 
 * -- methods --
 * 
 * put(K key, V value): Adds a key-value pair.
 * get(Object key): Retrieves the value associated with a key.
 * remove(Object key): Removes the key-value pair.
 * 
 */

package notes.unit4.codes;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map: " + map);
        System.out.println("Value for 'Two': " + map.get("Two"));
    }
}
