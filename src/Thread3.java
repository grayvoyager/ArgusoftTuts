import java.util.*;
class Sender {
    public void messaging(String message, String messages)
    {
        System.out.println("Sending a message");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("The message has been successfully sent!!"+message+messages);
    }
}
class newThread extends Thread
{
    private String msg;
    private String msgs;
    Sender sender;
    newThread(String m, String ms, Sender obj)
    {
        msg=m;
        msgs=ms;
        sender=obj;
    }
    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized (sender)
        {
            // synchronizing the send object
            sender.messaging(msg,msgs);
        }
    }
}
class SyncDemo {
    public static void main(String args[])
    {
        Sender send = new Sender();
        newThread S1 = new newThread(" Hi ","Hello", send);
        newThread S2 = new newThread(" Bye ","Adios", send);

        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        }
        catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
