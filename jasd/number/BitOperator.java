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
    
    public static int zero(int x, int y) { return 0; }
    
    public static int one(int x, int y) { return -1; }
    
    public static int nimp(int x, int y) { return x & ~y; }
    
    public static int cnimp(int x, int y) { return ~x & y; }
    
    public static int imply(int x, int y) { return ~x | y; }
    
    public static int nimply(int x, int y) { return x | ~y; } // previously cimply
}
