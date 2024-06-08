package notes.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface CustomTypeAnnotation{

}

@Target({ElementType.METHOD, ElementType.TYPE})
@interface CustomTypeAnnotation2{

}

@CustomTypeAnnotation2
@CustomTypeAnnotation
class b{

}

public class TypeAnno {
    public static void main(String[] args) {
        
    }
}
