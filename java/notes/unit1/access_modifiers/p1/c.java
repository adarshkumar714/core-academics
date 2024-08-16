package notes.unit1.access_modifiers.p1;

import packages.mypack2.p1.a;

public class c {
    public static void main(String[] args) {
        // a.thisisdefault();
        a.thisispublic();
        // a.thisisprotected();
        // a.thisisprivate();
    }
}

class d extends a{
    public static void main(String[] args) {
        // a.thisisdefault();
        a.thisispublic();
        a.thisisprotected();
        // a.thisisprivate();
    }
}


