public class Interface {
    public static void main(String[] args) {
        System.out.println("-----------------Interfaces");
        // Interfaces
        Boy2 b2 = new Boy2();
        b2.walk();
        // System.out.println(Human.name2);  
    }
}

interface a {

}
interface c {
    void print();
    public void print2();
}
class b implements a, c {
    @Override
    public void print(){}

    @Override
    public void print2(){}
    
}


interface Human{
    String name2 = "abc";
    int eyes = 2;
    
}
interface Man2{
    void walk();
} 
class Boy2 implements Human, Man2{
    @Override
    public void walk(){
        System.out.println("boy2 is walking");
    }
}