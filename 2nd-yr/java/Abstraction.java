public class Abstraction {
    public static void main(String[] args) {
        xyz c = new xyz();
        c.a = 3;
        System.out.println(c.a);
    }
}

abstract class abc{
    int a;
    abstract public void hello();
    abstract public void greet();
}

class xyz extends abc{
    @Override
    public void hello(){
        System.out.println("hello");
    }

    @Override
    public void greet(){}
}

abstract class pyq extends abc{

}


