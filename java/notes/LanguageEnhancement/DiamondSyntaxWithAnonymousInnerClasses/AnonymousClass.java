// ref: https://www.geeksforgeeks.org/anonymous-inner-class-java/

package notes.LanguageEnhancement.DiamondSyntaxWithAnonymousInnerClasses;

interface A{
    String name = "ferb";
    int age = 20;
    void printAge();
    void printName();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // creating an anonymous class inside AnonymousClass class
        A a = new A() {
            public void printAge(){
                System.out.println(age);
            }
            public void printName(){
                System.out.println(name);
            }
        };

        a.printAge();
        a.printName();
    }
}
