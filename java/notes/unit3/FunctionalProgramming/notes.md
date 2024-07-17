* abstract methods of an interface are always public
```java
interface A{
    void a();
}
class B implements A{
    // making method a public
    public void a(){

    }
}
```
* ***Instance methods*** in Java are functions defined within a class that require an object of that class to be created before calling.