// package notes.FunctionalProgramming.LambdaExpression;

@FunctionalInterface
interface A{
    void a();
    default void b(){
        System.out.println("b method");
    }
}

public class LE {
    public static void main(String[] args) {
        A obj1 = new A() {
            public void a(){
                System.out.println("a method");
            }
        };
        obj1.a();
        obj1.b();

        // using lambda function
        A obj2 = () -> {
            System.out.println("line 1");
            System.out.println("line 2");
        };
        obj2.a();
        obj2.b();

        // using lambda function for only one statement or one line of code
        A obj3 = () -> System.out.println("implementing absract method a of interface A using anonymous class using lambda expression");
        obj3.a();
        obj3.b();


    }
}
