### Annotations
**Examples**
* @Override
* @SuppressWarnings("")
* @Deprecated

**Categories of Annotations**
* Marker Annotations
* Single value Annotations
* Full Annotations
* ***Type Annotations***: These annotations can be applied to any place where a type is being used. For example, we can annotate the return type of a method. These are declared annotated with @Target annotation.
* ***Repeating Annotations***: These are the annotations that can be applied to a single item more than once. For an annotation to be repeatable it must be annotated with the @Repeatable annotation, which is defined in the java.lang.annotation package. Its value field specifies the container type for the repeatable annotation. The container is specified as an annotation whose value field is an array of the repeatable annotation type. Hence, to create a repeatable annotation, firstly the container annotation is created, and then the annotation type is specified as an argument to the @Repeatable annotation.