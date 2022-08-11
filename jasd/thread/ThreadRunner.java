package jasd.thread;

public class ThreadRunner implements Runnable
{
    private Runnable method;

    public ThreadRunner() { this.method = null; }

    public ThreadRunner(Runnable method) { this.method = method; }

    @Override
    public void run() { this.method.run(); }

    /**
     * Sets the method that could be run.
     * @param method Runnable object to set.
     * @return Previously stored method.
     */
    public Runnable setMethod(Runnable method)
    {
        Runnable r = this.method;
        this.method = method;
        return r;
    }

    /**
     * Returns method that is stored.
     * @return Stored Runnable
     */
    public Runnable getMethod() { return this.method; }
}
