 class EnclosingClass {
    // Static field of enclosing class
    static int staticField = 10;

    // Non-static field of enclosing class
    int nonStaticField = 20;

    // Non-static nested class (inner class)
    class NestedClass {
        // Static method in the nested class
        static void staticMethod() {
            System.out.println("Static method in nested class");
            // Can access static members of enclosing class directly
            System.out.println("Enclosing static field: " + staticField);

            // Cannot access non-static members of enclosing class directly
            // System.out.println(nonStaticField); // This would cause a compilation error
        }

        // Non-static method in the nested class (for comparison)
        void nonStaticMethod() {
            System.out.println("Non-static method in nested class");
            // Can access both static and non-static members of enclosing class
            System.out.println("Enclosing static field: " + staticField);
            System.out.println("Enclosing non-static field: " + nonStaticField);
        }
    }
}

public class oreva {
    public static void main(String[] args) {
        EnclosingClass enclosing = new EnclosingClass();
        EnclosingClass.NestedClass nested = enclosing.new NestedClass();
        nested.staticMethod();
    }
}
