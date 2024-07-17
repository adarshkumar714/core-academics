package notes.LanguageEnhancement.SealedClass;

import java.lang.*;

sealed class Human permits A, B, C{
    public void print(){

    }
}

sealed class A extends Human{
    public void print(){
        System.out.println("asdf");
    }
}

final class B extends Human{
    public void print(){
        System.out.println("asdf");
    }
}

non-sealed class C extends Human{
    public void print(){
        System.out.println("asdf");
    }
}

public class code {

}
