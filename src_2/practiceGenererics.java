class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("The type is "+ obj.getClass().getName());
    }
    T get(){
        return obj;
    }
}

public class practiceGenererics {
    public static void main(String[] args) {
        Gen<String> gen = new Gen<>("Luffy");
        gen.show();
        System.out.println(gen.get());

        Gen<Integer> geto = new Gen<>(99);
        geto.show();
        System.out.println(geto.get());

        Gen<Double> gojo = new Gen<>(99.99);
        gojo.show();
        System.out.println(gojo.get());
    }
}
