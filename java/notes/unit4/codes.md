Certainly! I'll provide sample Java code for each of the topics you've listed.

### 1. **Iterator Interface**

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

### 2. **Collection Interface**

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

### 3. **List Interface**

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

### 4. **ArrayList**

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

### 5. **LinkedList**

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

### 6. **Vector**

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

### 7. **Stack**

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

### 8. **Queue Interface**

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

### 9. **Set Interface**

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

### 10. **HashSet**

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

### 11. **LinkedHashSet**

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

### 12. **SortedSet Interface**

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

### 13. **TreeSet**

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

### 14. **Map Interface**

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

### 15. **HashMap Class**

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

### 16. **LinkedHashMap Class**

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

### 17. **TreeMap Class**

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

### 18. **Hashtable Class**

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

### 19. **Sorting**

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

### 20. **Comparable Interface**

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

### 21. **Comparator Interface**

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

