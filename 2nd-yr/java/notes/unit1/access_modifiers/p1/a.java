package notes.unit1.access_modifiers.p1;

public class a {
    public static void main(String[] args) {
        
        // accessing in same class
        thisisdefault();
        thisispublic();
        thisisprotected();
        thisisprivate();

    }


    static void thisisdefault(){
        System.out.println("this is default");
    }

    public static void thisispublic(){
        System.out.println("this is public");
    }
    
    protected static void thisisprotected(){
        System.out.println("this is protected");
    }
    
    private static void thisisprivate(){
        System.out.println("this is private");
    }

    class _innerclass{
        _innerclass(){
            // accessing in inner class
            thisisdefault();
            thisispublic();
            thisisprotected();
            thisisprivate();
        }
    }
}

// accessing in subclass
class accessmodifiers_test extends a{
    accessmodifiers_test(){
        thisisdefault();
        thisispublic();
        thisisprotected();
        // thisisprivate();
    }
}

// accessing in same package
class _subclass{
    _subclass(){
        a.thisisdefault();
        a.thisispublic();
        a.thisisprotected();
        // a.thisisprivate();
    }
}





