package jasd.thread;

public class ThreadSleeper
{
    private ThreadSleeper() { }

    /**
     * Makes an easy way to schedule a thread sleep.
     * @param millis Number of milliseconds the thread will sleep.
     */
    public static void sleep(final long millis)
    {
        try { Thread.sleep(millis); }
        catch (InterruptedException ie) { ie.printStackTrace(); }
    }
}
