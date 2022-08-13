package jasd.thread;

/**
 * This class makes an easy way to execute a new thread because it already implements <code>Runnable</code>.
 */
public class ThreadRunner implements Runnable
{
    private Runnable method;

    /**
     * Creates the object with a <code>null</code> method.
     */
    public ThreadRunner() { this.method = null; }

    /**
     * Creates the object with a specified method.
     * @param method Method to be run.
     */
    public ThreadRunner(final Runnable method) { this.method = method; }

    /**
     * This method is required to exist in order to execute the new thread.
     */
    @Override
    public void run() { this.method.run(); }

    /**
     * Sets the method that could be run.
     * @param method Runnable object to set.
     * @return Previously stored method.
     */
    public Runnable setMethod(final Runnable method)
    {
        final Runnable r = this.method;
        this.method = method;
        return r;
    }

    /**
     * Returns method that is stored.
     * @return Stored Runnable
     */
    public Runnable getMethod() { return this.method; }
}
