// package notes.FunctionalProgramming.MethodReferences;

@FunctionalInterface
interface A{
    void a();
}

interface C{
    void c();
}

interface D{
    void d();
}

class B{

    B(){
        System.out.println("this is constructor of class B");
    }

    static void print(){
        System.out.println("hello");
    }
    public void instanceMethod(){
        System.out.println("this is instance method of class B");
    }
}

// MR -> Method References
public class MR {
    public static void main(String[] args) {
        A obj1 = () -> System.out.println("hey");
        obj1.a();

        // method reference of static method
        // B.print();
        A obj2 = B::print;
        obj2.a();

        // method reference of instance method
        // B x = new B();
        // x.instanceMethod();
        C obj3 = new B()::instanceMethod;
        obj3.c();

        // method reference of constructor
        D obj4 = B::new;
        obj4.d();   // in this line constructor of B will be called
    }
}
