class Outer {
    static class Inner {
          void fun() {
            System.out.println("hello from non-static method in static nested class!");
        }
    }
}
 public class tiktik {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
//        Outer.Inner obj2 = obj1.new Inner();
        Outer.Inner obj2 =new Outer.Inner();
                obj2.fun();
//        Outer.Inner.fun();
    }
}