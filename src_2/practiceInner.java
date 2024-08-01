class Anime{
    static class goku{
         static void print(){
            System.out.println("gokuuuuuu");
        }
    }
}

public class practiceInner {
    public static void main(String[] args) {
//        Anime an = new Anime();
//        Anime.goku inner = an.new goku();
//        inner.print();
        Anime.goku.print();
    }
}

