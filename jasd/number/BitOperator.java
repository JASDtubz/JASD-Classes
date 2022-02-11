package jasd.number;

public class BitOperator
{
    public static int not(int x) { return ~x; }
    
    public static int and(int x, int y) { return x & y; }
    
    public static int or(int x, int y) { return x | y; }
    
    public static int nand(int x, int y) { return ~(x & y); }
    
    public static int nor(int x, int y) { return ~(x | y); }
    
    public static int xor(int x, int y) { return x ^ y; }
    
    public static int xnor(int x, int y) { return ~(x ^ y); }
    
    public static int right(int x, int y) { return ~x & y; }
    
    public static int left(int x, int y) { return x & ~y; }
}
