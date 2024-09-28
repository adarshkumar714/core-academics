# Java Collection Framework
The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures. Although referred to as a framework, it works in a manner of a library. The collections framework provides both interfaces that define various collections and classes that implement them.

### 1. **Iterator Interface**

**Definition**: The `Iterator` interface provides methods to iterate over a collection of objects. It is used to traverse through a collection, such as a list or set, without exposing the underlying data structure.

**Key Methods**:
- `hasNext()`: Checks if there are more elements.
- `next()`: Returns the next element.
- `remove()`: Removes the last element returned by the iterator.

**Example**:
```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
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
```

---

### 2. **Collection Interface**

**Definition**: The `Collection` interface is the root of the collection hierarchy in Java. It represents a group of objects, known as elements, and provides basic operations such as adding, removing, and checking the size of the collection.

**Key Methods**:
- `add(E e)`: Adds an element.
- `remove(Object o)`: Removes an element.
- `size()`: Returns the number of elements.

**Example**:
```java
import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("Python");
        collection.add("JavaScript");

        for (String language : collection) {
            System.out.println(language);
        }
    }
}
```

---

### 3. **List Interface**

**Definition**: The `List` interface extends the `Collection` interface and represents an ordered collection that allows duplicate elements. It provides positional access and manipulation methods.

**Key Methods**:
- `get(int index)`: Retrieves an element at a specific index.
- `set(int index, E element)`: Replaces the element at a specific index.
- `add(int index, E element)`: Inserts an element at a specific index.

**Example**:
```java
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, "Updated");
        System.out.println("Updated element at index 1: " + list.get(1));
    }
}
```

---

### 4. **ArrayList**

**Definition**: `ArrayList` is a resizable array implementation of the `List` interface. It provides fast random access and dynamic resizing but can be slower for insertions and deletions in the middle of the list.

**Key Characteristics**:
- Backed by an array.
- Allows null elements.
- Synchronized access is not supported.

**Example**:
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("ArrayList: " + list);
    }
}
```

---

### 5. **LinkedList**

**Definition**: `LinkedList` implements the `List` interface and uses a doubly-linked list to store elements. It allows for efficient insertions and deletions but has slower random access compared to `ArrayList`.

**Key Characteristics**:
- Allows null elements.
- Implements both `List` and `Deque` interfaces.

**Example**:
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("LinkedList: " + list);
    }
}
```

---

### 6. **Vector**

**Definition**: `Vector` is a legacy class that implements a dynamic array with synchronized access. It is similar to `ArrayList` but is synchronized.

**Key Characteristics**:
- Thread-safe due to synchronization.
- Older and less preferred compared to `ArrayList`.

**Example**:
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Vector: " + vector);
    }
}
```

---

### 7. **Stack**

**Definition**: `Stack` is a subclass of `Vector` that represents a last-in, first-out (LIFO) stack of objects.

**Key Methods**:
- `push(E item)`: Pushes an item onto the stack.
- `pop()`: Removes and returns the top item.
- `peek()`: Returns the top item without removing it.

**Example**:
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
```

---

### 8. **Queue Interface**

**Definition**: The `Queue` interface represents a collection designed for holding elements prior to processing. It supports FIFO (first-in, first-out) operations.

**Key Methods**:
- `offer(E e)`: Adds an element.
- `poll()`: Retrieves and removes the head element.
- `peek()`: Retrieves but does not remove the head element.

**Example**:
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
```

---

### 9. **Set Interface**

**Definition**: The `Set` interface represents a collection that does not allow duplicate elements. It is a subinterface of `Collection`.

**Key Methods**:
- Inherits methods from `Collection` (e.g., `add`, `remove`).

**Example**:
```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println("Set: " + set);
    }
}
```

---

### 10. **HashSet**

**Definition**: `HashSet` is a hash table-based implementation of the `Set` interface. It does not guarantee the order of elements.

**Key Characteristics**:
- Backed by a hash table.
- Does not allow duplicate elements.
- Null elements are allowed.

**Example**:
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Horse");

        System.out.println("HashSet: " + set);
    }
}
```

---

### 11. **LinkedHashSet**

**Definition**: `LinkedHashSet` is a hash table and linked list implementation of the `Set` interface, which maintains insertion order.

**Key Characteristics**:
- Maintains insertion order.
- Backed by a hash table and a linked list.
- Null elements are allowed.

**Example**:
```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        System.out.println("LinkedHashSet: " + set);
    }
}
```

---

### 12. **SortedSet Interface**

**Definition**: The `SortedSet` interface extends `Set` to handle sorted collections. It provides additional methods for handling a sorted set.

**Key Methods**:
- `first()`: Returns the first (lowest) element.
- `last()`: Returns the last (highest) element.
- `headSet(E toElement)`: Returns a view of the portion of the set.

**Example**:
```java
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
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
```

---

### 13. **TreeSet**

**Definition**: `TreeSet` is an implementation of the `SortedSet` interface that uses a red-black tree to store elements in a sorted order.

**Key Characteristics**:
- Elements are sorted.
- Does not allow duplicate elements.
- Null elements are not allowed.

**Example**:
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Alpha");
        set.add("Gamma");
        set.add("Beta");

        System.out.println("TreeSet: " + set);
    }
}
```

---

### 14. **Map Interface**

**Definition**: The `Map` interface represents a collection of key-value pairs. It does not extend `Collection` and provides methods for mapping keys to values.

**Key Methods**:
- `put(K key, V value)`: Adds a key-value pair.
- `get(Object key)`: Retrieves the value associated with a key.
- `remove(Object key)`: Removes the key-value pair.

**Example**:
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map: " + map);
        System.out.println("Value for 'Two': " + map.get("Two"));
    }
}
```

---

### 15. **HashMap Class**

**Definition**: `HashMap` is a hash table-based implementation of the `Map` interface. It allows for null values and keys and does not guarantee the order of its elements.

**Key Characteristics**:
- Backed by a hash table.
- Allows one null key and multiple null values.
- Fast access and insertion times.

**Example**:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("HashMap: " + map);
    }
}
```

---

### 16. **LinkedHashMap Class**

**Definition**: `LinkedHashMap` is a hash table and linked list implementation of the `Map` interface. It maintains the insertion order of keys.

**Key Characteristics**:
- Maintains insertion order.
- Allows null keys and values.

**Example**:
```java
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("LinkedHashMap: " + map);
    }
}
```

---

### 17. **TreeMap Class**

**Definition**: `TreeMap` is a Red-Black tree-based implementation of the `NavigableMap` interface. It is sorted by natural ordering of the keys or by a specified comparator.

**Key Characteristics**:
- Sorted by keys.
- Does not allow null keys (but allows null values).

**Example**:
```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Zebra", 1);
        map.put("Apple", 2);
        map.put("Monkey", 3);

        System.out.println("TreeMap: " + map);
    }
}
```

---

### 18. **Hashtable Class**

**Definition**: `Hashtable` is a legacy class that implements a hash table with synchronized access. It is similar to `HashMap` but is synchronized and does not allow null keys or values.

**Key Characteristics**:
- Thread-safe due to synchronization.
- Does not allow null keys or values.

**Example**:
```java
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Red", 1);
        table.put("Green", 2);
        table.put("Blue", 3);

        System.out.println("Hashtable: " + table);
    }
}
```

---

### 19. **Sorting**

**Definition**: Sorting refers to arranging elements in a specified order (ascending or descending). In Java, sorting is typically done using the `Collections.sort()` method for lists or by using custom comparators.

**Key Methods**:
- `Collections.sort(List<T> list)`: Sorts a list of comparable elements.
- `Arrays.sort(T[] array)`: Sorts an array.

**Example**:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
```

---

### 20. **Comparable Interface**

**Definition**: The `Comparable` interface is used to define the natural ordering of objects. Classes implementing `Comparable` provide a `compareTo` method to compare objects.

**Key Method**:
- `compareTo(T o)`: Compares the current object with another object.

**Example**:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));

        Collections.sort(list);

        System.out.println("Sorted persons: " + list);
    }
}
```

---

### 21. **Comparator Interface**

**Definition**: The `Comparator` interface is used to define custom ordering of objects. It provides a `compare` method to compare two objects.

**Key Method**:
- `compare(T o1, T o2)`: Compares two objects.

**Example**:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println("Sorted persons by age: " + list);
    }
}
```

---

### 22. **Properties Class**

**Definition**: The `Properties` class represents a persistent set of properties that can be loaded from or saved to a stream. It is a subclass of `Hashtable`.

**Key Methods**:
- `setProperty(String key, String value)`: Sets a property value.
- `getProperty(String key)`: Retrieves a property value.
- `load(InputStream inStream)`: Loads properties from a stream.

**Example**:
```java
import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // Set properties
        properties.setProperty("username", "admin");
        properties.setProperty("password", "password123");

        // Save properties to a file
        try (OutputStream output = new FileOutputStream("config.properties")) {
            properties.store(output, "Database Configuration");
        }

        // Load properties from a file
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            System.out.println("Username: " + properties.getProperty("username"));
        }
    }
}
```

---