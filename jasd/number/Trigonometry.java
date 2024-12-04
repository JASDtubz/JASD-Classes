package jasd.number;

public class Trigonometry
{
    private Trigonometry() { }

    /**
     * Sine function.
     * @param x
     * @return
     */
    public static double sin(double x) { return Math.sin(x); }

    /**
     * Cosine function.
     * @param x
     * @return
     */
    public static double cos(double x) { return Math.cos(x); }

    /**
     * Tangent function.
     * @param x
     * @return
     */
    public static double tan(double x) { return Math.tan(x); }

    /**
     * Cosecant function.
     * @param x
     * @return
     */
    public static double csc(double x) { return 1 / Trigonometry.sin(x); }

    /**
     * Secant function.
     * @param x
     * @return
     */
    public static double sec(double x) { return 1 / Trigonometry.cos(x); }

    /**
     * Cotangent function.
     * @param x
     * @return
     */
    public static double cot(double x) { return 1 / Trigonometry.tan(x); }

    /**
     * Chord function.
     * @param x
     * @return
     */
    public static double crd(double x) { return 2 * Trigonometry.sin(x / 2); }

    /**
     * Versine function.
     * @param x
     * @return
     */
    public static double ver(double x) { return 1 - Trigonometry.cos(x); }

    /**
     * Coversine function.
     * @param x
     * @return
     */
    public static double cvs(double x) { return 1 - Trigonometry.sin(x); }

    /**
     * Haversine function.
     * @param x
     * @return
     */
    public static double hvs(double x) { return 0.5 * Trigonometry.ver(x); }

    /**
     * Hacoversine function.
     * @param x
     * @return
     */
    public static double hcv(double x) { return Trigonometry.cvs(x) / 2; }

    /**
     * Vercosine function.
     * @param x
     * @return
     */
    public static double vcs(double x) { return 1 + Trigonometry.cos(x); }

    /**
     * Covercosine function.
     * @param x
     * @return
     */
    public static double cvc(double x) { return 1 + Trigonometry.sin(x); }

    /**
     * Havercosine function.
     * @param x
     * @return
     */
    public static double hvc(double x) { return Trigonometry.vcs(x) / 2; }

    /**
     * Hacovercosine function.
     * @param x
     * @return
     */
    public static double hcc(double x) { return Trigonometry.cvc(x) / 2; }

    /**
     * Arcversine function.
     * @param x
     * @return
     */
    public static double aver(double x) { return Trigonometry.arccos(1 - x); }

    /**
     * Arcvercosine function.
     * @param x
     * @return
     */
    public static double avcs(double x) { return Trigonometry.arccos(x - 1); }

    /**
     * Arccoversine function.
     * @param x
     * @return
     */
    public static double acvs(double x) { return Trigonometry.arcsin(1 - x); }

    /**
     * Arccovercosine function.
     * @param x
     * @return
     */
    public static double acvc(double x) { return Trigonometry.arcsin(x - 1); }

    /**
     * Archaversine function.
     * @param x
     * @return
     */
    public static double ahvs(double x) { return Trigonometry.arccos(1 - 2 * x); }

    /**
     * Archavercosine function.
     * @param x
     * @return
     */
    public static double ahvc(double x) { return Trigonometry.arccos(2 * x - 1); }

    /**
     * Archacoversine function.
     * @param x
     * @return
     */
    public static double ahcv(double x) { return Trigonometry.arcsin(1 - 2 * x); }

    /**
     * Archacovercosine function.
     * @param x
     * @return
     */
    public static double ahcc(double x) { return Trigonometry.arcsin(2 * x - 1); }

    /**
     * Exsecant function.
     * @param x
     * @return
     */
    public static double exs(double x) { return Trigonometry.sec(x) - 1; }

    /**
     * Excosecant function.
     * @param x
     * @return
     */
    public static double exc(double x) { return Trigonometry.csc(x) - 1; }

    /**
     * Arcexsecant function.
     * @param x
     * @return
     */
    public static double aexs(double x) { return Trigonometry.arcsec(x + 1); }

    /**
     * Arcexcosecant function.
     * @param x
     * @return
     */
    public static double aexc(double x) { return Trigonometry.arccsc(x + 1); }

    /**
     * Hyperbolic Sine function.
     * @param x
     * @return
     */
    public static double sinh(double x) { return Math.sinh(x); }

    /**
     * Hyperbolic Cosine function.
     * @param x
     * @return
     */
    public static double cosh(double x) { return Math.cosh(x); }

    /**
     * Hyperbolic Tangent function.
     * @param x
     * @return
     */
    public static double tanh(double x) { return Math.tanh(x); }

    /**
     * Hypperbolic Cotangent function.
     * @param x
     * @return
     */
    public static double coth(double x) { return Trigonometry.cosh(x) / Trigonometry.sinh(x); }

    /**
     * Hyperbolic Secant function.
     * @param x
     * @return
     */
    public static double sech(double x) { return 1 / Trigonometry.cosh(x); }

    /**
     * Hyperbolic Cosecant function.
     * @param x
     * @return
     */
    public static double csch(double x) { return 1 / Trigonometry.sinh(x); }

    /**
     * Area Hyperbolic Sine function.
     * @param x
     * @return
     */
    public static double arsinh(double x) { return Logarithm.ln(x + Math.sqrt(x * x + 1)); }

    /**
     * Area Hyperbolic Cosine function.
     * @param x
     * @return
     */
    public static double arcosh(double x) { return Logarithm.ln(x + Math.sqrt(x * x - 1)); }

    /**
     * Area Hyperbolic Tangent function.
     * @param x
     * @return
     */
    public static double artanh(double x) { return 0.5 * Logarithm.ln((1 + x) / (1 - x)); }

    /**
     * Area Hyperbolic Cotangent function.
     * @param x
     * @return
     */
    public static double arcoth(double x) { return 0.5 * Logarithm.ln((x + 1) / (x - 1)); }

    /**
     * Area Hyperbolic Secant function.
     * @param x
     * @return
     */
    public static double arsech(double x) { return Logarithm.ln(1 / x + Math.sqrt(1 / (x * x) - 1)); }

    /**
     * Area Hyperbolic Cosecant function.
     * @param x
     * @return
     */
    public static double arcsch(double x) { return Logarithm.ln(1 / x + Math.sqrt(1 / (x * x) + 1)); }

    /**
     * Arcsine function.
     * @param x
     * @return
     */
    public static double arcsin(double x) { return Math.asin(x); }

    /**
     * Arccosine function.
     * @param x
     * @return
     */
    public static double arccos(double x) { return Math.acos(x); }

    /**
     * Arctangent function.
     * @param x
     * @return
     */
    public static double arctan(double x) { return Math.atan(x); }

    /**
     * Arccotangent function.
     * @param x
     * @return
     */
    public static double arccot(double x) { return Trigonometry.arccos(x / Math.sqrt(1 + x * x)); }

    /**
     * Arcsecant function.
     * @param x
     * @return
     */
    public static double arcsec(double x) { return Trigonometry.arccos(1 / x); }

    /**
     * Arccosecant function.
     * @param x
     * @return
     */
    public static double arccsc(double x) { return Trigonometry.arcsin(1 / x); }

    /**
     * Sinc function.
     * @param x
     * @return
     */
    public static double sinc(double x) { return x != 0 ? Trigonometry.sin(x) / x : 1.0D; }

    /**
     * Sinhc function.
     * @param x
     * @return
     */
    public static double sinhc(double x) { return Trigonometry.sinh(x) / x; }

    /**
     * Coshc function.
     * @param x
     * @return
     */
    public static double coshc(double x) { return Trigonometry.cosh(x) / x; }

    /**
     * Tanc function.
     * @param x
     * @return
     */
    public static double tanc(double x) { return Trigonometry.tan(x) / x; }

    /**
     * Tanhc function.
     * @param x
     * @return
     */
    public static double tanhc(double x) { return Trigonometry.tanh(x) / x; }

    /**
     * Arc function.
     * @param x
     * @return
     */
    public static double arc(double x) { return Math.abs(Trigonometry.arcsin(Trigonometry.sin(x))); }


    /**
     * Arcchord function.
     * @param x
     * @return
     */
    public static double acrd(double x) { return 2 * Trigonometry.arcsin(x / 2); }
}
