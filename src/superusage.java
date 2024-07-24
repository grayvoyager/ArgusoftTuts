public class superusage {
    public void mine()
    {
        System.out.println("The statement that you see here is being printed by the super class but being impl...");
    }
}
class sup extends superusage{
    public void mine()
    {
        super.mine();//checking the usage of super before override
        System.out.println("This statement is being printed using the subclass.");
        super.mine();
    }
    public static void main(String... args){
        sup s= new sup();
        s.mine();


    }
}
