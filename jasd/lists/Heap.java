import java.util.Objects;

public class Heap<C>
{
    private C item;
    private Heap<C> left = null, right = null, parent = null;
    private int layer = 0;
    private boolean queued = true, priority = true;

    public Heap() { }
    
    public Heap(C item)
    
//     public Heap(Collection<? extends C> c)
//     {
//         if (c != null && !(c.get(0) instanceof Comparable)) { }
//     }

    Heap(C item, int layer) { this.layer = layer; }
    
    public void insert(C item)
    {
        if (item.hashCOde() >= this.item.hashCode()) { }
    
        if (Objects.isNull(this.left))
        {
            this.left = new Heap<C>(item, this.layer + 1);
            this.checkQueue();
            return;
        }
        else if (Objects.isNull(this.right))
        {
            this.right = new Heap<C>(item, this.layer + 1);
            this.checkQueue();
            return;
        }
        else if (this.left.getPriority()) { this.left.insert(item); }
        else if (this.right.getPriority()) { this.right.insert(item); }
        
        
    }
    
    boolean getPriority() { return this.priority; }
    
    private void checkQueue() { this.queued = !Objects.isNull(this.left) && !Objects.isNull(this.right); }
    
    
    
    
    
    
    private void getPriorityQueue()
    {
    }
}
