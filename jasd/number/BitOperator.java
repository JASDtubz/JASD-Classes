package jasd.number;

/**
 * This class has static methods that does bit-wise operations with 2 integers.
 * @author Jean-Denis Toting de beauvoir
 * @version 2022.8.1.13.38
 */
public class BitOperator
{
    private BitOperator() { }

    /**
     * Takes the bit-wise false of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise zero.
     */
    public static int zero(int x, int y) { return 0; }

    /**
     * Takes the bit-wise nor of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise nor.
     */
    public static int nor(int x, int y) { return ~(x | y); }

    /**
     * Takes the bit-wise converse nonimplication of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise cnimp.
     */
    public static int cnimp(int x, int y) { return ~x & y; }

    /**
     * Takes the bit-wise first compliment of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise notx.
     */
    public static int notx(int x, int y) { return ~x; }

    /**
     * Takes the bit-wise nonimplication of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise nimp.
     */
    public static int nimp(int x, int y) { return x & ~y; }

    /**
     * Takes the bit-wise second compliment of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise noty.
     */
    public static int noty(int x, int y) { return ~y; }

    /**
     * Takes the bit-wise exclusive or of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise xor.
     */
    public static int xor(int x, int y) { return x ^ y; }

    /**
     * Takes the bit-wise nand of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise nand.
     */
    public static int nand(int x, int y) { return ~(x & y); }

    /**
     * Takes the bit-wise and of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise and.
     */
    public static int and(int x, int y) { return x & y; }

    /**
     * Takes the bit-wise exclusive nor of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise xnor.
     */
    public static int xnor(int x, int y) { return ~(x ^ y); }

    /**
     * Takes the bit-wise second of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise y.
     */
    public static int y(int x, int y) { return y; }

    /**
     * Takes the bit-wise implication of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise imply.
     */
    public static int imply(int x, int y) { return ~x | y; }

    /**
     * Takes the bit-wise first of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise x.
     */
    public static int x(int x, int y) { return x; }

    /**
     * Takes the converse implication of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise nimply.
     */
    public static int nimply(int x, int y) { return x | ~y; }

    /**
     * Takes the bit-wise or of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise or.
     */
    public static int or(int x, int y) { return x | y; }

    /**
     * Takes the bit-wise true of 2 integers.
     * @param x Top integer.
     * @param y Bottom integer.
     * @return Bit-wise one.
     */
    public static int one(int x, int y) { return -1; }
}
