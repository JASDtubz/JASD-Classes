package jasd.thread;

/**
 * This class makes an easy way to schedule a thread sleep.
 */
public class ThreadSleeper
{
    private ThreadSleeper() { }

    /**
     * Sleeps the current thread for a specified length of milliseconds.
     * @param millis Number of milliseconds the thread will sleep.
     */
    public static void sleep(final long millis)
    {
        try { Thread.sleep(millis); }
        catch (final InterruptedException ie) { ie.printStackTrace(); }
    }
}
