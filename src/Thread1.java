public class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("the user thread created by extending thread class has started!"+currentThread());
        }


    }

    public static void main(String[] args) {
        {
            Thread1 thread = new Thread1();
            thread.start();
            Thread thread2= new Thread(new Thread2());
            thread2.start();

        }
    }
}
