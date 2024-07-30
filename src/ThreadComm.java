class ThreadComm {
    int amt=10000;
    synchronized void withdraw(int amount)
    {
        if(amt<amount)
        {
            System.out.println("The amount entered is greater than the available acc balance!! Waiting for deposit");
            try{
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        amt-=amount;


    }
    synchronized void deposit(int amount)
    {
          System.out.println("Depositing"+amount);
          try{
                Thread.sleep(1000);
            }
          catch (InterruptedException e)
            {
                e.printStackTrace();
            }
          amt+=amount;
          System.out.println("Deposit success!!");
          notify();
        }
}
class withdraw extends Thread{
    private int amount;
    private ThreadComm comm;
    public withdraw(ThreadComm commu, int amt){
    comm=commu;
    amount=amt;}
    public void run()
    {
        comm.withdraw(amount);
    }
}
class execution {
    public static void main(String[] args) {
        ThreadComm obj = new ThreadComm();
        try {
//        new Thread() {
//            public void run() { obj.withdraw(15000); }
//        }.start();
            Thread T1 = new withdraw(obj, 15000);
            T1.start();
//            T1.join();
//Using Anonymous inner classes to declare a thread
            new Thread() {
                public void run() {
                    obj.deposit(10000);
                }
            }.start();
        }
        catch
        (Exception e)
        {
            e.printStackTrace();
        }


    }
}
