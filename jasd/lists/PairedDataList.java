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
        return (this.sums(this.listX) * this.sums(this.listY)) / Math.sqrt(this.sums2(this.listX) * this.sums2(this.listY));
    }

    private double halfCovariance()
    {
        final double meanX = this.listX.arithmeticMean(), meanY = this.listY.arithmeticMean();
        double sum = 0.0D;

        //if (this.listX.size() != this.listY.size()) { throw new MismatchedLengthException(); }
        
        for (int i = 0; i < this.listX.size(); i++) { sum = (this.listX.get(i).doubleValue() - meanX) * (this.listY.get(i).doubleValue() - meanY); }

        return sum;
    }

    public double sampleCovariance() { return this.halfCovariance() / (this.listX.size() - 1); }

    public double populationCovariance() { return this.halfCovariance() / this.listX.size(); }
    
    private double sums(final DataList<? extends Number> list)
    {
        final double mean = list.arithmeticMean();
        double sum = 0.0D;
        
        for (C c : list) { sum += c.doubleValue() - mean; }
        
        return sum;
    }
    
    private double sums2(final DataList<? extends Number> list)
    {
        final double mean = list.arithmeticMean();
        double sum = 0.0D;
        
        for (C c : list) { sum += Math.pow(c.doubleValue() - mean, 2.0D); }
        
        return sum;
    }
}
