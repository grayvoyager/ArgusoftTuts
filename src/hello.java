// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public interface hello {
    public void m1();
    public void m2();
}
class hollo implements hello {
    public void m1() {
        System.out.println("Method 1 had been printed");
    }

    public void m2() {
        System.out.println("Method 2 had been printed");}

    public static void main(String[] args)
        {
            hollo obj = new hollo();
            obj.m1();
            obj.m2();
        }
    }


