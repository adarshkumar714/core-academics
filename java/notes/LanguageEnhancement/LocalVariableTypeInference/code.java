package notes.LanguageEnhancement.LocalVariableTypeInference;

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        var a = "hi";
        System.out.println(a);

        var b = new ArrayList<>();
        b.add(3);
        b.add(5);
        b.add(5.3);
        b.add(true);
        printList(b);        
    }
    
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
