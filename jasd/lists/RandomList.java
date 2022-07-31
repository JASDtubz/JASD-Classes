import java.util.Random;

public class RandomList
{
    private final Random random;

    public RandomList() { this.random = new Random(); }

    public RandomList(long seed) { this.random = new Random(seed); }

    public byte[] randomizeList(byte[] list)
    {
        byte[] rand = new byte[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            byte[] temp = new byte[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public byte getRandomItem(byte[] list) { return list[this.random.nextInt(list.length)]; }

    public short[] randomizeList(short[] list)
    {
        short[] rand = new short[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            short[] temp = new short[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public short getRandomItem(short[] list) { return list[this.random.nextInt(list.length)]; }

    public int[] randomizeList(int[] list)
    {
        int[] rand = new int[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            int[] temp = new int[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public int getRandomItem(int[] list) { return list[this.random.nextInt(list.length)]; }

    public long[] randomizeList(long[] list)
    {
        long[] rand = new long[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            long[] temp = new long[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public long getRandomItem(long[] list) { return list[this.random.nextInt(list.length)]; }

    public float[] randomizeList(float[] list)
    {
        float[] rand = new float[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            float[] temp = new float[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public float getRandomItem(float[] list) { return list[this.random.nextInt(list.length)]; }

    public double[] randomizeList(double[] list)
    {
        double[] rand = new double[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            double[] temp = new double[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public double getRandomItem(double[] list) { return list[this.random.nextInt(list.length)]; }

    public char[] randomizeList(char[] list)
    {
        char[] rand = new char[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            char[] temp = new char[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public char getRandomItem(char[] list) { return list[this.random.nextInt(list.length)]; }

    public String[] randomizeList(String[] list)
    {
        String[] rand = new String[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            String[] temp = new String[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = temp;
        }

        list = rand;

        return list;
    }

    public String getRandomItem(String[] list) { return list[this.random.nextInt(list.length)]; }

    @SuppressWarnings(value = "unchecked")
    public <C> C[] randomizeList(C[] list)
    {
        Object[] rand = new Object[list.length];

        for (int i = 0; i < rand.length; i++)
        {
            int index = this.random.nextInt(list.length);
            Object[] temp = new Object[list.length - 1];

            rand[i] = list[index];

            System.arraycopy(list, 0, temp, 0, index);
            System.arraycopy(list, index + 1, temp, index, temp.length - index);

            list = (C[]) temp;
        }

        list = (C[]) rand;

        return list;
    }

    public <C> C getRandomItem(C[] list) { return list[this.random.nextInt(list.length)]; }
}
