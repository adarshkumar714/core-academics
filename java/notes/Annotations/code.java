package notes.Annotations;

@CustomTypeAnnotation
class A{
    void print(){
        System.out.println("in A");
    }
    static void print2(){
        System.out.println("A::print2");
    }
}

class B extends A{
    @CustomTypeAnnotation2
    @Override
    void print(){
        System.out.println("in B");
    }

    /*
     * static methods can not be overridden...
     * ...but can be hidden by making the...
     * ...same name method in this class
     */
    // @Override
    static void print2(){
        System.out.println("B::print2");
    }
}

public class code {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
        // obj.print2(); // warning use -> B.print2()
        B.print2();

        @SuppressWarnings("unused")
        int a = 0;
    }
}
