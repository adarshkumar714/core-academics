// package notes.FunctionalProgramming.StaticMethods;

class A{
    // static method
    static void a(){
        System.out.println("static method a of class A");
    }
    // instance method
    void b(){
        System.out.println("b");
    }
}

public class SM {
    public static void main(String[] args) {
        A x = new A();
        A.a();
        x.b();
    }
}
