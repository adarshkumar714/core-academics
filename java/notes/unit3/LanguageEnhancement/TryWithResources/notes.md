### Try-With-Recources
* In Java, the Try-with-resources statement is a try statement that declares one or more resources in it. A resource is an object that must be closed once your program is done using it. For example, a File resource or a Socket connection resource.  The try-with-resources statement ensures that each resource is closed at the end of the statement execution. If we don’t close the resources, it may constitute a resource leak and also the program could exhaust the resources available to it.

* You can pass any object as a resource that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.

* By this, now we don’t need to add an extra finally block for just passing the closing statements of the resources. The resources will be closed as soon as the try-catch block is executed. 