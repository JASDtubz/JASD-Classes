package jasd.number;

public class Logarithm
{
    public static double log(double x, double y) { return Logarithm.lg(y) / Logarithm.lg(x); }

    public static double lg(double x) { return Math.log10(x); }

    public static double ln(double x) { return Math.log(x); }

    public static double lb(double x) { return Logarithm.log(2, x); }
}
