package jasd.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * {@code ArrayListPlus} is an extension of the {@code ArrayList} class that consists of less used methods. These
 * methods are mostly operations that you can do to a list and will return {@code true} if the list has been changed.
 * Methods will return {@code false} if the operation makes the list look the same.
 *
 * @param <C> Object list type.
 * @author Jean-Denis Toting de Beauvoir
 * @version 2022.8.18.13.36
 */
public class ArrayListPlus<C> extends ArrayList<C>
{
    private static final long serialVersionUID = 202281104615L;

    /**
     * Constructs a new {@code ArrayListPlus} object.
     */
    public ArrayListPlus() { super(); }

    /**
     * Constructs a new {@code ArrayListPlus} object containing a Collection.
     *
     * @param c Starting list.
     */
    public ArrayListPlus(final Collection<? extends C> c) { super(c); }

    /**
     * Constructs a new {@code ArrayListPlus} object with an initial size.
     *
     * @param i Initial list size.
     */
    public ArrayListPlus(final int i) { super(i); }

    /**
     * Shuffles the list using the {@code Random} class.
     *
     * @return {@code true} if the list has been scrambled and changed.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public boolean shuffle() { return this.shuffle(new Random()); }

    /**
     * Shuffles the list using the {@code Random} class with a seed.
     *
     * @param seed Seed for the {@code Random} class.
     * @return {@code true} if the list has been scrambled and changed.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public boolean shuffle(final long seed) { return this.shuffle(new Random(seed)); }

    @SuppressWarnings(value = "unchecked")
    private boolean shuffle(final Random r)
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
     *
     * @param first Index of first item. (Inclusive)
     * @param second Index of second item. (Inclusive)
     * @return {@code true} if the items have been swapped and different.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public final boolean swap(final int first, final int second)
    {        
        return !super.set(first, super.set(second, super.get(first))).equals(super.get(first));
    }

    /**
     * Swaps 2 items in the list.
     *
     * @param first Item in list to be swapped 1.
     * @param second Item in list to be swapped 2.
     * @return {@code true} if the items have been swapped and different.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public boolean swap(C first, C second)
    {
        if (super.contains(first) && super.contains(second))
        {
            return this.swap(super.indexOf(first), super.indexOf(second));
        }

        return false;
    }

    /**
     * Sorts the hash codes of the objects in the list.
     *
     * @return {@code true} if the items have been sorted and changed.
     */
    @SuppressWarnings(value = "unchecked")
    public boolean sortByHashCode()
    {
        final int length = super.size();
        final int[] codes = new int[length];
        final Object[] prev = super.toArray();

        for (int i = 0; i < length; i++) { codes[i] = super.get(i).hashCode(); }

        Arrays.sort(codes);

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                final C c = (C) prev[j];

                if (codes[i] == c.hashCode())
                {
                    super.set(i, c);

                    break;
                }
            }
        }

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Sorts the list using the {@code Arrays.sort()} method.
     *
     * @return {@code true} if the list has been sorted and changed.
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @SuppressWarnings(value = "unchecked")
    public boolean sort()
    {
        final Object[] list = super.toArray(), prev = super.toArray();

        if (!(list[0] instanceof Comparable)) { return this.sortByHashCode(); }

        Arrays.sort(list);
        this.setList((C[]) list);

        return !Arrays.equals(prev, list);
    }

    /**
     * Replaces the entire list with a new one.
     *
     * @param list List to replace current one.
     * @return {@code true} if the two lists are different.
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     */
    public final boolean setList(final C[] list)
    {
        Object[] prev = super.toArray();

        super.clear();
        Collections.addAll(this, list);

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Reverses the entire list.
     *
     * @return {@code true} if the list has been reversed and changed.
     */
    public boolean reverse() { return this.reverse(0, super.size() - 1); }

    /**
     * Reverses the list from a starting and ending index.
     *
     * @param start Starting index to reverse. (Inclusive)
     * @param end Ending index to reverse. (Inclusive)
     * @return {@code true} if the list has been reversed and changed.
     * @throws ArrayIndexOutOfBoundsException {@inheritDoc} A check will be added in a later version.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     */
    @SuppressWarnings(value = "unchecked")
    public boolean reverse(int start, final int end)
    {
        final Object[] prev = super.toArray();

        for (int index = end; start <= end; start++, index--) { super.set(start, (C) prev[index]); }

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Shifts the list right by a certain amount.
     *
     * @param amount Shift amount.
     * @return {@code true} if the list has been shifted and changed.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     *
     */
    public boolean shiftRight(final int amount) { return this.shift(-amount); }

    /**
     * Shifts the list left by a certain amount.
     * @param amount Shift amount.
     * @return {@code true} if the list has been shifted and changed.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public boolean shiftLeft(final int amount) { return this.shift(amount); }

    @SuppressWarnings(value = "unchecked")
    private boolean shift(int a)
    {
        final int length = super.size();
        final Object[] prev = super.toArray(), first, second, full = new Object[length];

        if (a < 0)
        {
            a = -a;

            if (a >= length) { a %= length; }

            first = this.getSublist(0, length - a - 1);
            second = this.getSublist(length - a, length - 1);
        }
        else
        {
            if (a >= length) { a %= length; }

            first = this.getSublist(0, a - 1);
            second = this.getSublist(a, length - 1);
        }

        System.arraycopy(second, 0, full, 0, second.length);
        System.arraycopy(first, 0, full, second.length, first.length);
        this.setList((C[]) full);

        return !Arrays.equals(prev, super.toArray());
    }

    /**
     * Returns a sublist from the indexes provided.
     *
     * @param start Starting index. (Inclusive)
     * @param end Ending index. (Inclusive)
     * @return Sublist from the indexes.
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @SuppressWarnings(value = "unchecked")
    public final C[] getSublist(int start, final int end)
    {
        final Object[] sub = new Object[end - start + 1];

        System.out.println(sub.length);

        for (int index = 0; start <= end; start++, index++) { sub[index] = super.get(start); }

        return (C[]) sub;
    }

    /**
     * Returns a list of all the locations of a certain item in the list.
     *
     * @param item Item to look for.
     * @return List of the indexes of the item.
     * @throws UnsupportedOperationException {@inheritDoc}
     */
    public int[] indexesOf(final C item)
    {
        final ArrayListPlus<C> list = this;
        int[] indexes = new int[0];

        while (list.contains(item))
        {
            indexes = this.addToList(indexes, list.indexOf(item));
            list.remove(item);
        }

        return indexes;
    }

    /**
     * Returns the amount of indexes of a specific item in the list.
     *
     * @param item Item to look for.
     * @return Amount of indexes in the list.
     * @throws UnsupportedOperationException {@inheritDoc}
     */
    public int amountOf(final C item) { return this.indexesOf(item).length; }

    //REMOVE ONCE ARRAYSPLUS GETS BUILT
    private int[] addToList(int[] ii, final int i)
    {
        final int[] jj = new int[ii.length + 1];

        System.arraycopy(ii, 0, jj, 0, ii.length);

        jj[ii.length] = i;

        ii = jj;

        return ii;
    }
}
