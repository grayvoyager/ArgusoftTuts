import java.util.ArrayList;

abstract class Home{
    static int members = 19;
    static void greeting(){
        System.out.println("helooooo_Home");
    }
    abstract void parents();
    abstract void child();
    private void happy(){
        System.out.println("happyyyyy.._Home");
    }
    void Home_method(){
        System.out.println("homeeeeeeeeeeeeeeeeee");
    }
}

class Me extends Home{
    public void parents(){
        System.out.println("okasan..otosan..");
    }
    void child(){
        System.out.println("kyodaitachi...");
    }
    static void greeting(){
        System.out.println("heloooo_me");
    }
}

public class practiceAbstract {
    public static void main(String[] args) {
        Me me = new Me();
        me.Home_method();
        me.child();
        me.parents();
        me.greeting();

        Home home = new Me();
        home.child();
        home.parents();
        home.Home_method();
        home.greeting();
        System.out.println(home.members);
        ArrayList<String> l = new ArrayList<>();
        l.add("hellooo");
    }
}
