package jasd.thread;

public class ThreadRunner implements Runnable
{
    private Runnable method;

    public ThreadRunner() { this.method = null; }

    public ThreadRunner(Runnable r) { this.method = r; }

    @Override
    public void run() { this.method.run(); }

    /**
     * Sets the method that could be run.
     * @param r Runnable object to set.
     */
    public void setMethod(Runnable r) { this.method = r; }

    /**
     * Returns the Runnable stored for running.
     * @return Stored Runnable
     */
    public Runnable getMethod() { return this.method; }
}
