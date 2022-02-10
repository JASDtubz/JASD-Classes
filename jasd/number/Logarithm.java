package jasd.number.logarithm;

public class Logarithm
{
    public static double log(x, y) { return Math.log(y) / Math.log(x); }

    public static double lg(x) { return Math.log(x); }

    public static double ln(x) { return Logarithm.log(Math.E, x); }

    public static double lb(x) { return Logarithm.log(2, x); }
}
