package notes.LanguageEnhancement.DiamondSyntaxWithAnonymousInnerClasses;

import java.util.ArrayList;
import java.util.List;

// generics does not work with premitive types like int, float, double, etc.
// it uses wrapper classes like Integer, Double, etc.

/*
class IntegerPrinter{
    Integer n;
    public IntegerPrinter(Integer n){
        this.n = n;
    }
    public void print(){
        System.out.println(n);
    }
}
class DoublePrinter{
    Double n;
    public DoublePrinter(Double n){
        this.n = n;
    }
    public void print(){
        System.out.println(n);
    }
}
*/

// we can write anything at the place of 'T'
class Printer<T>{
    T n;
    public Printer(T n){
        this.n = n;
    }
    public void print(){
        System.out.println(n);
    }
}

public class Generics {
    public static void main(String[] args) {
        /*
        IntegerPrinter ip = new IntegerPrinter(10);
        ip.print();

        DoublePrinter dp = new DoublePrinter(10.2);
        dp.print();
        */

        Printer<Integer> ip = new Printer<>(20);
        ip.print();

        Printer<Double> dp = new Printer<Double>(20.2);
        dp.print();

        /* ---------------------------------------------------------------------- */
        
        // printing using generic method
        genericMethod(ip.n, 1);
        genericMethod(dp.n, 2);
        genericMethod("hello", 3);
        genericMethod(true, 4);
        genericMethod(2.623452, 5);
        genericMethod('a', 6);

        /* ---------------------------------------------------------------------- */

        List<Integer> intlist = new ArrayList<>();
        intlist.add(2);
        printList(intlist);


        List<Double> doublelist = new ArrayList<>();
        doublelist.add(2.3);
        printList(doublelist);

        List<AnonymousClass> classlist = new ArrayList<>();
        classlist.add(new AnonymousClass());
        printList(classlist);

    }

    // you can take any number of types like T and V
    public static <T, V> void genericMethod(T data, V data2){
        System.out.print(data2);
        System.out.print(" ");
        System.out.println(data);
    }

    // with return type
    public static <T> T withReturnType(T data){
        return data;
    }

    // wild card : ?
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
