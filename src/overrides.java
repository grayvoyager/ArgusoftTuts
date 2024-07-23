public class overrides {
     void property()
    {
        System.out.println("Cashed up!!");
    }
    public void marry()
    {
        System.out.println("Jhumpuri");
    }
}
class pua extends overrides
{
     void property ()
 {
     System.out.println("Megan");
 }
}
class Test
{
    public static void main(String[] args){
        overrides obj= new overrides();
//        obj.property();
//        obj.property();
        pua obj1= new pua();
        obj1.property();
    }
}

