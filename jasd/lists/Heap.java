public class Heap<C>
{
    private C c;
    private Heap<C> left, right;
    private int layer = 0;

    public Heap() { }
    
    public Heap(Collection<? extends C> c)
    {
        if (c != null && !(c.get(0) instanceof Comparable)) { }
    }
    
    
}
