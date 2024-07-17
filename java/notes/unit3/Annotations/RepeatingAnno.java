package notes.Annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(CustomRepeatingAnnotations.class)
@interface CustomRepeatingAnnotation{
    String word() default "this is the default value of word variable";
    int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface CustomRepeatingAnnotations{
    CustomRepeatingAnnotation[] value();
}



public class RepeatingAnno {
    public static void main(String[] args) {
        
    }

    @CustomRepeatingAnnotation(word = "name1", value = 1)
    @CustomRepeatingAnnotation(word = "name2", value = 2)
    public static void newMethod() {
        /*
        RepeatingAnno ra = new RepeatingAnno();
        try {
            Class<?> c = ra.getClass();

            Method m = c.getMethod("newMethod", RepeatingAnno.class);

            Annotation a = m.getAnnotation(CustomRepeatingAnnotations.class);
            
        } catch (NoSuchMethodException e) {
            
        }
        */
        
    }
}
