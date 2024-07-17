package labexps;

public class four {
    public static void main(String[] args) {
        MyInheritance x = new MyInheritance();
        x.test();
        x.test1();

        MyPolymorphism y = new MyPolymorphism();
        y.test();
        y.test("HI");
        y.test("Hello", 2);
    }
}

class a{
    public void test1(){
        System.out.println("test function of MyInheritance");
    }
}
interface b{
    void a();
}
interface c{
    void b();

}
class MyInheritance extends a implements b, c{
    public void a(){

    }
    public void b(){
        
    }
    public void test(){
        System.out.println("test function of MyInheritance");
    }
}


class MyPolymorphism{
    public void test(){
        System.out.println("test function of MyPolymorphism");
    }
    public void test(String temp){
        System.out.println(temp);
    }
    public void test(String temp, int num){
        System.out.println(temp+' '+num);
    }
}