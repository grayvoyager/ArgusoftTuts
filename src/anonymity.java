abstract class Animal {
    abstract void makeSound();
}

public class anonymity {
    public static void main(String[] args) {
        // Creating an instance of Animal using an anonymous inner class
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Woof!");
            }
        };

        dog.makeSound(); // Outputs: Woof!
    }
}