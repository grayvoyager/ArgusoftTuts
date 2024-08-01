class Shape {
    private static String color;

    // Abstract method (must be implemented by subclasses)
    static double area(){
        System.out.println("etoooooo...parent methodsss");
        return 3.14;
    }

    // Concrete method
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Static method
    public static void describe() {
        System.out.println("Shapes have area and color.");
    }

    // Final method
    public static void displayInfo() {
        System.out.println("Color: " + color + ", Area: " + area());
    }

    // Private method
    private void internalMethod() {
        System.out.println("This is an internal method.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
}

public class abustract {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.setColor("Red");
        System.out.println("Circle's color: " + circle.getColor());
        System.out.println("Circle's area: " + circle.area());

        // Call static method from abstract class
        Shape.describe();

        // Display info using final method
        Shape.displayInfo();
    }
}
