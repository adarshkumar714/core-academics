package notes.FunctionalProgramming.FunctionalInterfaces;

@FunctionalInterface
interface A{
    void print();
    // void print2();
}

// 1st method to implement functional interface
class B implements A{
    @Override
    public void print(){
        System.out.println("In class B");
    }
}

/* ---------------------------------------------------------------------------- */

// FI with 2 parameters
@FunctionalInterface
interface Add{
    void add(int x, int y);
}

// FI with 1 parameter
@FunctionalInterface
interface OnlyOneVariable{
    void printX(int x);
}

/* ---------------------------------------------------------------------------- */

// FI with some return type
@FunctionalInterface
interface withReturnType{
    int add(int x, int y);
}

/* ---------------------------------------------------------------------------- */

// FI -> functional Interface
public class FI {
    public static void main(String[] args) {
        // A obj = new A(); // this will show error

        // 1st method
        B obj1 = new B();
        obj1.print();

        // 2nd method to implement functional interface
        A obj2 = new A(){
            public void print(){
                System.out.println("In class FI");
                int a = 3;
                System.out.println(a);
            }
        };
        obj2.print();

        // 3rd method to implement functional interfaces using Lambda function
        A obj3 = () -> System.out.println("Using Lambda function");
        obj3.print();

        A obj4 = () -> {
            System.out.println("first line using lambda function");
            System.out.println("second line using lambda function");
        };
        obj4.print();

        /* ---------------------------------------------------------------------------- */

        Add aa = new Add() {
            public void add(int x, int y){
                System.out.println(x+y);
            }
        };
        aa.add(5, 6);
        // taking parameters in functional interface
        Add a = (int x, int y) -> System.out.println(x+y);
        a.add(3,5);

        // functional interface with only one paramter
        OnlyOneVariable b = x -> {
            System.out.println(x);
        };
        b.printX(10);

        /* ---------------------------------------------------------------------------- */

        // functional interface with some return type
        withReturnType c = (int x, int y) -> {
            System.out.println("hi");
            return x+y;
        };
        int temp = c.add(6, 4);
        System.out.println(temp);

        withReturnType d = (i,j) ->  i+j;
        temp = d.add(6, 4);
        System.out.println(temp);
    }
}



// Program from GFG
// Java program to demonstrate functional interface
 
class Test {
    public static void main(String args[]){
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run(){
                System.out.println("New thread created");
            }
        }).start();

        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}



// interface T{
//     void a();
//     void b();
//     void c();
// }

// abstract class E{
//     abstract void a();
//     void b(){
//         System.out.println("hey");
//     }
// }