package jasd.thread;

public class ThreadRunner implements Runnable
{
    private Runnable method;

    public ThreadRunner() { this.method = null; }

    public ThreadRunner(Runnable r) { this.method = r; }

    @Override
    public void run() { this.method.run(); }

    public void setMethod(Runnable r) { this.method = r; }

    public Runnable getMethod() { return this.method; }
}
