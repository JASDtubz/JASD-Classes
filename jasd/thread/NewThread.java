package jasd.thread;

/**
 * This class provides an easy way to make a new thread that runs temporarily.
 */
public class NewThread
{
    private Runnable method;

    /**
     * Creates a new thread with a <code>null</code> method ready.
     */
    public NewThread() { this.method = null; }

    /**
     * Creates a new thread with a method ready.
     * @param method Method for thread to execute.
     */
    public NewThread(final Runnable method) { this.method = method; }

    /**
     * Executes stored method in a new thread.
     */
    public void execute() { this.execute(this.method); }

    /**
     * Executes a method in the parameter in a new thread.
     * @param method Method to be run in a new thread.
     */
    public void execute(final Runnable method) { new Thread(new ThreadRunner(method)).start(); }

    /**
     * Sets method to be run.
     * @param method Method to be run.
     * @return Method previously stored.
     */
    public Runnable setMethod(final Runnable method)
    {
        final Runnable r = this.method;
        this.method = method;
        return r;
    }

    /**
     * Gets method stored.
     * @return Method that is stored.
     */
    public Runnable getMethod() { return this.method; }
}
