public class code {
    public static void main(String[] args) {
        animal a = new animal();
        a.age = 8;
        System.out.println(a.age);
        a.setAge(10);
        System.out.println(a.age);

        animal b = new animal();
        // b.age = 5;
        System.out.println(b.age);
    }
}


class animal{

    int age = 4;
    animal(){

        this.age = 210;
    }
    public void setAge(int age){
        this.age = age;
    }
    // String name = "";
}