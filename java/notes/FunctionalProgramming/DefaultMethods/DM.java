package notes.FunctionalProgramming.DefaultMethods;

interface A{
    void a();
    // void b(){ // this will show error...
        // ...because interfaces can not have methods with implementation with default keyword 
    // }
    default void b(){
        System.out.println("this is default method b of class A");
    }
    void c();
}

class B implements A{
    // abstract methods of an interface are always public
    public void a(){
        System.out.println("this is method a of class B and interface A");
    }

    public void c(){
        System.out.println("this is method c of class B and interface A");
    }
}

public class DM {
    public static void main(String[] args) {
        B obj = new B();
        obj.a();
        obj.b();
        obj.c();
    }
}



interface te{
    void a();
    void b();
    default void c(){
        System.out.println("hey");
    }
    default int add(int x, int y){
        return x+y;
    }
}