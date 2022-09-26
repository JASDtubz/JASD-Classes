package jasd.lists;

import jasd.annotations.Copyable;

@Copyable(hasCopyMethod = true)
public class DataList<C extends Number> extends ArrayListPlus<C>
{
    private static final long serialVersionUID = 1853461384L;

    public DataList() { super(); }

    public double arithmeticMean() { return this.sum() / super.size(); }

    public double geometricMean()
    {
        double total = 0.0D;

        for (C c : this) { total *= c.doubleValue(); }

        return Math.pow(total, 1.0D / super.size());
    }

    public double median()
    {
        final DataList<C> list = this.copy();
        final int two = list.size() / 2;

        list.sort();

        if (list.size() % 2 == 0) { return (list.get(two - 1).doubleValue() + list.get(two).doubleValue()) / 2; }
        else { return list.get(two).doubleValue(); }
    }

    private double halfVariance()
    {
        final double mean = this.arithmeticMean();
        double sum = 0;

        for (C c : this) { sum += Math.pow(c.doubleValue() - mean, 2.0D); }

        return sum;
    }

    public double populationVariance() { return this.halfVariance() / super.size(); }

    public double sampleVariance() { return this.halfVariance() / (super.size() - 1); }

    public double populationStandardDeviation() { return Math.sqrt(this.populationVariance()); }

    public double sampleStandardDeviation() { return Math.sqrt(this.sampleVariance()); }
    
    public double firstQuartile()
    {
        final DataList<C> list = this.copy();
        final int size = super.size();
        
        list.sort();
        
        if (size % 2 == 0 && size % 4 != 0 || size % 2 != 0 && size / 2 % 2 != 0) { return list.get(size / 4).doubleValue(); }
        else { return (list.get(size / 4 - 1).doubleValue() + list.get(size / 4).doubleValue()) / 2; }
    }

    public double range()
    {
        final DataList<C> list = this.copy();

        list.sort();

        return list.get(list.size() - 1).doubleValue() - list.get(0).doubleValue();
    }

    public double sum()
    {
        double sum = 0.0D;

        for (C c : this) { sum += c.doubleValue(); }

        return sum;
    }

    @Copyable(copyMethod = true)
    @Override
    @SuppressWarnings(value = "unchecked")
    public DataList<C> copy() { return (DataList<C>) this.clone(); }
}
