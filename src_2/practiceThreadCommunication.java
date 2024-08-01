class ThreadCom extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("Child thread starting calculation");
            for (int i = 0; i <= 100; i++)
                total+=i;
            System.out.println("Child thread completed calculation");
            this.notify();
        }

    }

}


public class practiceThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        ThreadCom th = new ThreadCom();
        th.start();
        synchronized (th){
            System.out.println("Main thread waiting for notification");
            th.wait();
            System.out.println("Main thread received notification");
            System.out.println(th.total);
        }
    }
}
