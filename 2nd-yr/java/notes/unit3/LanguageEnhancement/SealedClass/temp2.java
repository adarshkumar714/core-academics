package notes.unit3.LanguageEnhancement.SealedClass;

public class temp2 {
    public static void main(String[] args) {
        one a = new two();
        a.print1();

        two b = new two();
        b.print2();
        b.print1();

        three c = new three();
        c.print3();
    }
}

sealed class one permits two {
    private static void print1(){
        System.out.println("HELLO, this is one");
    }
    public void nothing(){
        System.out.println("nothing");
    }

    class a{
        a(){
            print1();
            one.print1();
        }
    }
}

final class two extends one {
    void print2(){
        print1();
        nothing();
        System.out.println("HELLO, this is two");
    }
}

class three {
    void print3(){
        System.out.println("HELLO, this is three");
    }
}
