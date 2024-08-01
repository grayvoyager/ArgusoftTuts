class display{
     static void greet(String name){
             for (int i = 0; i < 10; i++) {
                 System.out.println("Ohioo Ozaimas..."+name);
                 try {
                     Thread.sleep(2000);
                 }
                 catch (InterruptedException e)
                 {
                     System.out.println("Thread interrupetd");
                 }
         }
    }
}

class myThread extends Thread{
    display d;
    String msg;
    myThread(display d, String msg){
        this.d = d;
        this.msg = msg;
    }
    public void run(){
        synchronized (d){
            d.greet(this.msg);
        }
    }
}

public class practiceThreadTwo {
    public static void main(String[] args) {
        display d = new display();
        myThread t1 = new myThread(d,"Ansh");
        myThread t2 = new myThread(d,"Montu");
        t1.start();
        t2.start();
    }
}
