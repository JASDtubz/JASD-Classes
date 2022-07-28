package jasd.thread;

public class NewThread
{
    public Runnable method;

    public NewThread() { this.method = null; }

    public NewThread(Runnable r) { this.method = r; }

    public void execute() { this.execute(this.method); }

    public void execute(Runnable method) { new Thread(new ThreadRunner(method)).start(); }
    
    public void setMethod(Runnable method) { this.method = method; }
    
    public Runnable getMethod() { return this.method; }
}
