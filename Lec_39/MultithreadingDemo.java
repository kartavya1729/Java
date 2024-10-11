package Lec_39;
    
class ThreadClass extends Thread
{
    private String threadName;

    public ThreadClass(String threadName)
    {
        this.threadName = threadName;
    }

    public void run()
    {
        for(int i = 0;i < 5;i++)
        {
            System.out.println(threadName + " " + i);

        }
    }
}

public class MultithreadingDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {
        ThreadClass t1 = new ThreadClass("Thread1");
        ThreadClass t2 = new ThreadClass("Thread2");

        t1.start();
        //t1.start();
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();
        //t2.join();
        System.out.println("Main Thread");

        System.out.println(t1.isAlive());
    }
}