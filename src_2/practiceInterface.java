interface DBZ{
    static int i = 400;
    default void goku(){
        System.out.println("gokuuuu");
    }
    static void vageta(){
        System.out.println("vagetaaa");
    }
     void picollo();
}

class earth implements DBZ{
    public void picollo(){
        System.out.println("picoloooo...");
    }
    static void vageta(){
        System.out.println("vagetaaa.....");
    }
    public void goku(){
        System.out.println("gohan");
    }
}

public class practiceInterface {
    public static void main(String[] args) {
//        DBZ.vageta();

        earth e = new earth();
        e.picollo();
        e.goku();
        e.vageta();

        DBZ db = new earth();
        System.out.println(db.i);
        System.out.println(DBZ.i);
        db.goku();
//        db.vageta();
    }
}
