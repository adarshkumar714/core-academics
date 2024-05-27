***Static members***: In Java, static members are those which belongs to the class and you can access these members without instantiating the class.

### Data types
* boolean
* char
* int -> byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
* float -> float (4 byte), double (8 byte)

### Type casting
* `int a = (int) 2.3f;`

### String
* length -> `txt.length()`
* convert to upper case -> `txt.toUpperCase()`
* concatenate two string -> `txt1.concat(txt2)`
* to print index of a perticular char -> `txt.indexOf("a")`

### Math
* max value of 2 int -> `Math.max(3,5)`
* square root -> `Math.sqrt()`
* random no. -> `Math.random()`

### Ternary operator
* `(a>b)?(a):(b)`

### Switch case
```java
int day = 1;
switch(day){
    case 1:
        // code
        break;
    case 2:
        // code
        break;
    default:
        break;
}
```

### do while loop
```java
int i = 1;
do {
    // code
    i++;
} while(i<6);
```

### Exceptions
```java

try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} 
catch
 (Exception e) {
  System.out.println("Something went wrong.");
}
```

```java
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
}
catch (Exception e) {
  System.out.println("Something went wrong.");
} 
finally {
  System.out.println("The 'try catch' is finished.");
}
```




