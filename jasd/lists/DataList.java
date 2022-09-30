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
        final DataList<C> list = this.getSortedList();
        final int two = list.size() / 2;

        if (list.size() % 2 == 0) { return (list.get(two - 1).doubleValue() + list.get(two).doubleValue()) / 2; }
        else { return list.get(two).doubleValue(); }
    }

    public double minimum() { return this.getSortedList().get(0).doubleValue(); }

    public double maximum() { return this.getSortedList().get(super.size() - 1).doubleValue(); }

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
        final DataList<C> list = this.getSortedList();
        final int size = super.size(), four = size / 4;

        if (size % 2 == 0 && size % 4 != 0 || size % 2 != 0 && size / 2 % 2 != 0)
        {
            return list.get(four).doubleValue();
        }
        else { return (list.get(four - 1).doubleValue() + list.get(four).doubleValue()) / 2; }
    }

    public double thirdQuartile()
    {
        final DataList<C> list = this.getSortedList();
        final int size = super.size(), two = size / 2, four = size / 4;

        if (size % 2 == 0)
        {
            if (size % 4 == 0)
            {
                return (list.get(two + four - 1).doubleValue() + list.get(two + four).doubleValue()) / 2;
            }
            else { return list.get(two + four).doubleValue(); }
        }
        else
        {
            if (size / 2 % 2 == 0)
            {
                return (list.get(two + four).doubleValue() + list.get(two + four + 1).doubleValue())/ 2;
            }
            else { return list.get(two + four + 1).doubleValue(); }
        }
    }

    public double interquartileRange() { return this.thirdQuartile() - this.firstQuartile(); }

    public double range()
    {
        final DataList<C> list = this.getSortedList();

        return list.get(list.size() - 1).doubleValue() - list.get(0).doubleValue();
    }

    public double sum()
    {
        double sum = 0.0D;

        for (C c : this) { sum += c.doubleValue(); }

        return sum;
    }

    public double mode()
    {
        int total = 0, index = 0;

        for (C c : this)
        {
            final int amount = super.indexesOf(c).length;

            if (amount > total)
            {
                total = amount;
                index = super.indexOf(c);
            }
        }

        return super.get(index).doubleValue();
    }

    public double percentileOf(Number num)
    {
        final DataList<C> list = this.getSortedList();
        final double n = num.doubleValue();

        if (list.get(0).doubleValue() > n) { return 0.0D; }
        else if (list.get(list.size() - 1).doubleValue() < n) { return 100.0D; }
        else
        {
            double counter = 0;

            for (C c : list)
            {
                if (c.doubleValue() >= n) { return counter / list.size(); }
                else { counter++; }
            }

            return 100.0D;
        }
    }

    public double standardScoreOf(Number num)
    {
        return (num.doubleValue() - this.arithmeticMean()) / this.populationStandardDeviation();
    }

    private DataList<C> getSortedList()
    {
        final DataList<C> list = this.copy();

        if (!list.isCurrentlySorted()) { list.sort(); }

        return list;
    }

    private boolean isCurrentlySorted()
    {
        for (int i = 0; i < super.size() - 1; i++)
        {
            if (super.get(i).doubleValue() > super.get(i + 1).doubleValue()) { return false; }
        }

        return true;
    }

    @Copyable(copyMethod = true)
    @Override
    @SuppressWarnings(value = "unchecked")
    public DataList<C> copy() { return (DataList<C>) this.clone(); }
}
