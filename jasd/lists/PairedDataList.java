package jasd.lists;

public class PairedDataList<X extends Number, Y extends Number>
{
    private DataList<X> listX;
    private DataList<Y> listY;

    public PairedDataList()
    {
        this.listX = new DataList<X>();
        this.listY = new DataList<Y>();
    }
    
    public PairedDataList(final DataList<? extends Number> x, final DataList<? extends Number> y)
    {
        this.listX = x;
        this.listY = y;
    }
    
    public DataList<X> getListX() { return this.listX; }
    
    public DataList<Y> getListY() { return this.listY; }
    
    public DataList<X> setListX(final DataList<X> x)
    {
        final DataList<X> prev = this.listX;
        
        this.listX = x;
        
        return prev;
    }
    
    public DataList<Y> setListY(final DataList<Y> y)
    {
        final DataList<Y> prev = this.listY;
        
        this.listY = y;
        
        return prev;
    }
    
    public PairedDataList<X, Y> addPair(final X x, final Y y)
    {
        this.listX.add(x);
        this.listY.add(y);
        
        return this;
    }
    
    public double correlation()
    {
        final double sumX = this.sums(this.listX), sumY = this.sums(this.listY);
    
        return (sumX * sumY) / Math.sqrt(Math.pow(sumX, 2.0D) * Math.pow(sumY, 2.0D));
    }
    
    private double sums(final DataList<? extends Number> list)
    {
        final double mean = list.arithmeticMean();
        double sum = 0.0D;
        
        for (C c : list) { sum += c.doubleValue() - mean; }
        
        return sum;
    }
}
