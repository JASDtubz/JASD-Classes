package jasd.lists;

import java.util.ArrayList;
import java.util.HashMap;

public class HashArray<K, V>
{
    private final HashMap<K, ArrayList<V>> hash = new HashMap<>();

    public HashArray() { }

    public HashArray(final K k, final ArrayList<V> list) { this.hash.put(k, list); }

    public HashArray<K, V> put(final K k, final V v)
    {
        if (!this.hash.containsKey(k)) { this.hash.put(k, new ArrayList<>()); }

        this.getList(k).add(v);

        return this;
    }

    public HashArray<K, V> remove(final K k, final V v)
    {
        this.getList(k).remove(v);

        return this;
    }

    public ArrayList<V> getList(final K k) { return this.hash.get(k); }
}
