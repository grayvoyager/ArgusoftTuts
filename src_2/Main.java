class parent{
    static int variable = 10;
    void eto(){
        System.out.println("etoo...parent");
    }
     static class nested{
        int variable = 5;
        void eto(){
            System.out.println("etoo...child");
        }
    }
    nested n = new nested();
}
public class Main {
    public static void main(String[] args) {
        parent.nested n = new parent.nested();
        n.eto();
        System.out.println(n.variable);
    }
}