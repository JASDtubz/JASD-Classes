package jasd.number.logarithm;

public class Logarithm
{
    public static double log(double x, double y) { return Math.log(y) / Math.log(x); }

    public static double lg(double x) { return Math.log(x); }

    public static double ln(double x) { return Logarithm.log(Math.E, x); }

    public static double lb(double x) { return Logarithm.log(2, x); }
}
