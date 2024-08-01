class MyThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
        }
    }
}

public class practiceThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join();
        for (int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
