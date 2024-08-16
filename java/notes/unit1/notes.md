## jar and classpath
<!-- By default java looks for .class files in '.' folder (current folder) -->
<!-- -cp (classpath) is used to tell java that where to look for .class files -->

1. javac fol/* -d t

2. jar cf lib.jar -C t .

3. javac -cp lib.jar:. Main.java 
4. javac -cp lib.jar:. Main.java

dezip/extract .class files : jar xf lib.jar fol/

command to zip any folder: zip -r a.zip folder_name_to_zip


## import and static import

```java
import fol.A; // import

public class test{
    public static void main(String args[]){
        

        // A x = new A();
        // A.a();

        fol.A.a(); // static import


    }
}

```