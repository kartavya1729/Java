class GreetingThread extends Thread 
{
    private String message;

    public GreetingThread(String message) 
    {
        this.message = message;
    }

    @Override
    public void run() 
    {
        System.out.println(message);
    }
}

public class GreetingsInReverse 
{
    public static void main(String[] args) throws InterruptedException 
    {
        String[] greetings = {"Hello", "Hi", "Good Morning", "Welcome", "Greetings"};

        Thread[] threads = new Thread[greetings.length];

        for (int i = 0; i < greetings.length; i++) 
        {
            threads[i] = new GreetingThread(greetings[i]);
        }

        for (int i = greetings.length - 1; i >= 0; i--) 
        {
            threads[i].start();
            threads[i].join();
        }
    }
}