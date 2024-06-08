### Functional Interfaces and Lambda Expression
***ref***: https://www.geeksforgeeks.org/functional-interfaces-java/
* An interface which contains only one abstract method.
* Functional Interface is additionally recognized as ***Single Abstract Method Interfaces*** or ***SAM Interfaces***.
* We can use Lambda function to implement functional interfaces.
* lambda function can only be used to implement functional interfaces.
* Run the code using below commands
```shell
javac -d . FI.java
java notes.FunctionalInterfaces.FI2
```
***Some Built-in functional interfaces***
* Runnable –> This interface only contains the run() method.
* Comparable –> This interface only contains the compareTo() method.
* ActionListener –> This interface only contains the actionPerformed() method.
* Callable –> This interface only contains the call() method.

