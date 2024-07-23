import java.util.*;
public class sortfirst {
    public int[] getRandom(int len)
    {
        int[] arr = new int[len];
        Random random =new Random();
        int i;
        for (i=0;i< arr.length;i++)
        {
            arr[i]= random.nextInt(100);
        }
        return arr;
    }
    public static void main(String[] args)
    {
        sortfirst obj=new sortfirst();
        int arrn[]= obj.getRandom(10);
        int j=0;
        for(j=0;j<arrn.length;j++) {
            System.out.print(arrn[j]+" ");
        }
        System.out.println(' ');
        Arrays.sort(arrn);
        for(j=0;j<arrn.length;j++) {
            System.out.print(arrn[j]+" ");
        }
        int arrnew[]=new int[20];
        Arrays.fill(arrnew,10);
        for(j=0;j<arrnew.length;j++) {
            System.out.println(arrnew[j]+" ");
        }
        Arrays.binarySearch(arrnew,10);



    }
}
