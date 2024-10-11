package Lec_40;

class RunnableClass implements Runnable
{
    public void run()
    {
        for(int i = 0;i < 5;i++)
        System.out.println("Thread is Running:" +Thread.currentThread().getName());
    }
}

public class RunableDemo 
{
    public static void main(String[] args) 
    {
        RunnableClass obj1 = new RunnableClass();
        Thread t1 = new Thread(obj1,"Thread 1");
        t1.start();

        RunnableClass obj2 = new RunnableClass();
        Thread t2 = new Thread(obj2,"Thread 2");
        t2.start();

//        //Anonymous Class
//        Runnable obj3 = new Runnable(){
//            @Override
//            public void run() {
//                for(int i = 0;i < 5;i++)
//                    System.out.println("Thread is Running:" +Thread.currentThread().getName());
//
//            }
//        };
//
//        Thread t3 = new Thread(obj3);
//        t3.start();
//
//        //lambda expression
//        Runnable obj4 = () -> System.out.println("Thread is Running");
//        Thread t4 = new Thread(obj4);
//        t4.start();

    }
}
