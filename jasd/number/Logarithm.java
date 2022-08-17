package jasd.number;

/**
 * This class provides an easy way to call and declare all forms of logarithms.
 *
 * @author Jean-Denis Toting de Beauvoir
 * @version 2022.8.17.17.39
 */
public final class Logarithm
{
    private Logarithm() { }

    /**
     * Returns a logarithm with a base for a number.
     * 
     * @param base Base number of logarithm.
     * @param value Value of the number.
     * @return Log base of the number.
     */
    public static double log(final double base, final double value) { return Logarithm.lg(value) / Logarithm.lg(base); }

    /**
     * Returns the log base 10 of a value.
     * 
     * @param value Value of the number.
     * @return Log base 10 of the number.
     */
    public static double lg(final double value) { return Math.log10(value); }

    /**
     * Returns the log base e of a value.
     * 
     * @param value Value of the number.
     * @return Log base e of the number.
     */
    public static double ln(final double value) { return Math.log(value); }

    /**
     * Returns the log base 2 of a value.
     * 
     * @param value Value of the number.
     * @return Log base 2 of the number.
     */
    public static double lb(final double value) { return Logarithm.log(2.0D, value); }
}
