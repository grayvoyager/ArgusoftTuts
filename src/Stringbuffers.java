public class Stringbuffers {
    public static void main(String[] args){
        StringBuffer sb= new StringBuffer();
        StringBuffer sbn= new StringBuffer();

        sbn=sb.append("dszdfgsdfasffsfadsddszdfgsdffsfad");
sbn.append("asgd");
        System.out.println(sbn.capacity());
        System.out.println(sbn.length());
    }
}
