package jasd.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * {@code ArrayListPlus} is an extension of the {@code ArrayList} class that consists of less used methods.
 * @param <C> Object list type.
 * @author Jean-Denis Toting de Beauvoir
 */
public class ArrayListPlus <C> extends ArrayList<C>
{
    /**
     * Constructs a new {@code ArrayListPlus} object.
     */
    public ArrayListPlus() { super(); }

    /**
     * Constructs a new {@code ArrayListPlus} object containing a Collection.
     * @param c Starting list.
     */
    public ArrayListPlus(final Collection<? extends C> c) { super(c); }

    /**
     * Constructs a new {@code ArrayListPlus} object with an initial size.
     * @param i Initial list size.
     */
    public ArrayListPlus(final int i) { super(i); }

    /**
     * Shuffles the list using the {@code Random} class.
     * @return {@code true} if the list has been scrambled.
     */
    public boolean shuffleList() { return this.shuffleList(new Random()); }

    /**
     * Shuffles the list using the {@code Random} class with a seed.
     * @param seed Seed for the {@code Random} class.
     * @return {@code true} if the list has been scrambled.
     */
    public boolean shuffleList(final long seed) { return this.shuffleList(new Random(seed)); }

    @SuppressWarnings(value = "unchecked")
    private boolean shuffleList(final Random r)
    {
        Object[] list = super.toArray();
        final Object[] prev = list.clone();

        for (int i = 0; i < super.size(); i++)
        {
            final int index = r.nextInt(list.length);
            Object[] temp = new Object[list.length - 1];

            super.set(i, (C) list[index]);

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Swaps 2 items in the list.
     * @param a Index of first item.
     * @param b Index of second item.
     * @return {@code true} if the items have been swapped.
     */
    final public boolean swap(final int a, final int b)
    {
        C c = super.get(a);

        super.set(a, super.get(b));
        super.set(b, c);

        return !super.get(a).equals(super.get(b));
    }

    /**
     * Swaps 2 items in the list.
     * @param a Item in list to be swapped 1.
     * @param b Item in list to be swapped 2.
     * @return {@code true} if the items have been swapped.
     */
    public boolean swap(C a, C b)
    {
        if (super.contains(a) && super.contains(b)) { return this.swap(super.indexOf(a), super.indexOf(b)); }

        return false;
    }

    /**
     * Sorts the hash codes of the objects in the list.
     * @return {@code true} if the items have been sorted.
     */
    @SuppressWarnings(value = "unchecked")
    public boolean sortByHashCode()
    {
        final int length = super.size();
        final int[] codes = new int[length];
        final Object[] list = new Object[length];
        final Object[] prev = super.toArray();

        for (int i = 0; i < length; i++) { codes[i] = super.get(i).hashCode(); }

        Arrays.sort(codes);

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                final C c = super.get(j);

                if (codes[i] == c.hashCode())
                {
                    list[i] = c;

                    break;
                }
            }
        }

        this.setList((C[]) list);

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Sorts the list using the {@code Arrays.sort()} method.
     * @return {@code true} if the list has been sorted.
     */
    @SuppressWarnings(value = "unchecked")
    public boolean sort()
    {
        final Object[] list = super.toArray();
        final C c = (C) list[0];
        final Object[] prev = super.toArray();

        if (!(c instanceof Comparable)) { return this.sortByHashCode(); }

        Arrays.sort(list);
        this.setList((C[]) list);

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Replaced the entire list with a new one.
     * @param list List to replace current one.
     * @return {@code true} if the two lists are different.
     */
    public boolean setList(final C[] list)
    {
        Object[] prev = super.toArray();

        super.clear();
        Collections.addAll(this, list);

        return !Arrays.equals(prev, super.toArray());
    }
}
