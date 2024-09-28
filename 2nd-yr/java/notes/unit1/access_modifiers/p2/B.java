package notes.unit1.access_modifiers.p2;

import notes.unit1.access_modifiers.p1.*;

public class b {
    public static void main(String[] args) {
        // a.thisisdefault();
        a.thisispublic();
        // a.thisisprotected();
        // a.thisisprivate();
    }
}

class c extends a {
    public static void main(String[] args) {
        // thisisdefault();
        thisispublic();
        thisisprotected();
        // thisisprivate();
    }
}


