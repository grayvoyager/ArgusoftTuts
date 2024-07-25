public class nesting {

    private static int x = 1;
    private static int y=2;
    static int z=3;
    private int a=5;
    int b=6;
    void methode(String a){
        System.out.println(a);
    }


    static class StaticNested {

        private void run() {
            System.out.println(x+" "+y);
            System.out.println(x+y);
            System.out.println(z+y);
//            nesting nest= new nesting();
//            nest.methode("helloooo");
//
//            StaticNested stat= new StaticNested();
//            stat.methode();
//            System.out.println(a);
//            System.out.println(b);

        }
    }

    public static void main(String[] args) {
//        nesting.StaticNested nested = new nesting.StaticNested();
//        nested.run();
////        nested.methode();
        StaticNested stat= new StaticNested();
        stat.run();
    }
}