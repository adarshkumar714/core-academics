package notes.unit3.LanguageEnhancement.SealedClass;

// import java.lang.*;

sealed class Human permits A, B, C{
    public void print(){

    }
}

non-sealed class A extends Human{
    public void print(){
        System.out.println("asdf");
    }
}

class x extends A{

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
