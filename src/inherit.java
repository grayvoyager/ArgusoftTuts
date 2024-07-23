public class inherit {
    void method1()
    {
        System.out.println("Hello there, I am the baapaa");
    }
}
class inheritor extends inherit
{
//    void method1()
//    {
//        System.out.println("Hello there I am the chhua");
//    }
}
class Testo
{
    public static void main(String[] args)
    {
        inherit obj = new inherit();
        inheritor obj1= new inheritor();
        inherit obj2= new inheritor();
//        inheritor obj3= new inherit();
        obj.method1();
        obj1.method1();
        obj2.method1();
    }
}
