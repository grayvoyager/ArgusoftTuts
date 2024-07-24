// Checking of the usage of the word
public class superconst {
    private int input;
    public void mine()
    {
        System.out.println("The statement that you see here is being printed by the super class but being impl...");
    }
    public superconst(int inp)
    {
      this.input=inp;
        System.out.println("This here is a message from the super class constructor."+this.input);
    }
}
class supra extends superconst{
    String input1;
    public supra(int inpu,String inputs)
    {
        super(inpu);
        this.input1=inputs;
        System.out.println("Hello there!! This is a message from the subclass constructor."+this.input1);


    }
    @Override
    public void mine()
    {
        super.mine();//checking the usage of super before override
        System.out.println("This statement is being printed using the subclass.");
//        super.mine();
    }
    public static void main(String... args){
        supra s= new supra(10,"Twix");
        s.mine();


    }
}
