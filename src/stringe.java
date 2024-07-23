import java.sql.SQLOutput;

public class stringe {
    public static void main(String [] args)
    {
        String S1="hello";
        String S2="hello";
        String S3= new String("hello");
        StringBuilder sb = new StringBuilder("hello~");
        System.out.println(S1==S2);
        System.out.println(S1+ " "+S2+" "+S3);
        System.out.println(S1.equals(sb));
    }
}
