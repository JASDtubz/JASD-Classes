package jasd.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayListPlus <C> extends ArrayList<C>
{
    public ArrayListPlus() { super(); }

    public ArrayListPlus(Collection<? extends C> c) { super(c); }

    public ArrayListPlus(int i) { super(i); }

    public void shuffleList() { this.shuffleList(new Random()); }

    public void shuffleList(long seed) { this.shuffleList(new Random(seed)); }

    @SuppressWarnings(value = "unchecked")
    private void shuffleList(Random r)
    {
        Object[] list = super.toArray();

        for (int i = 0; i < super.size(); i++)
        {
            int index = r.nextInt(list.length);
            Object[] temp = new Object[list.length - 1];

            super.set(i, (C) list[index]);

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }
    }

    public void swap(int a, int b)
    {
        C c = super.get(a);

        super.set(a, super.get(b));
        super.set(b, c);
    }

    @SuppressWarnings(value = "unchecked")
    public void sortByHashCode()
    {
        final int length = super.size();
        int[] codes = new int[length];
        Object[] list = new Object[length];

        for (int i = 0; i < length; i++) { codes[i] = super.get(i).hashCode(); System.out.println(codes[i]); }

        Arrays.sort(codes);

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                C c = super.get(j);

                if (codes[i] == c.hashCode())
                {
                    list[i] = c;

                    break;
                }
            }
        }

        this.setList((C[]) list);
    }

    @SuppressWarnings(value = "unchecked")
    public boolean sort()
    {
        Object[] list = super.toArray();
        C c = (C) list[0];

        if (!(c instanceof Comparable))
        {
            this.sortByHashCode();

            return false;
        }

        Arrays.sort(list);
        this.setList((C[]) list);

        return true;
    }

    public void setList(C[] list)
    {
        this.removeAll();
        Collections.addAll(this, list);
    }
}
