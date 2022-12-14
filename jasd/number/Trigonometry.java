package jasd.number;

import jasd.number.Logarithm;

public class Trigonometry
{	
    private Trigonometry() { }
    
    public static double sin(double x) { return Math.sin(x); }

    public static double cos(double x) { return Math.cos(x); }

    public static double tan(double x) { return Math.tan(x); }

    public static double csc(double x) { return 1 / Trigonometry.sin(x); }

    public static double sec(double x) { return 1 / Trigonometry.cos(x); }

    public static double cot(double x) { return 1 / Trigonometry.tan(x); }

    public static double crd(double x) { return 2 * Trigonometry.sin(x / 2); }

    public static double ver(double x) { return 1 - Trigonometry.cos(x); }

    public static double cvs(double x) { return 1 - Trigonometry.sin(x); }

    public static double hvs(double x) { return 0.5 * Trigonometry.ver(x); }
    
    public static double hcv(double x) { return Trigonometry.cvs(x) / 2; }
    
    public static double vcs(double x) { return 1 + Trigonometry.cos(x); }
    
    public static double cvc(double x) { return 1 + trigonometry.sin(x); }
    
    public static double hvc(double x) { return Trigonometry.vcs(x) / 2; }
    
    public static double hcc(double x) { return Trigonometry.cvc(x) / 2; }
    
    public static double aver(double x) { return Trigonometry.arccos(1 - x); }
    
    public static double avcs(double x) { return Trigonometry.arccos(x - 1); }
    
    public static double acvs(double x) { return Trigonometry.arcsin(1 - x); }
    
    public static double acvc(double x) { return Trigonometry.arcsin(x - 1); }
    
    public static double ahvs(double x) { return Trigonometry.arccos(1 - 2 * x); }

    public static double exs(double x) { return Trigonometry.sec(x) - 1; }

    public static double exc(double x) { return Trigonometry.exsec(Math.PI / 2 - x); }
    
    public static double aexs(double x) { return Trigonometry.arcsec(x + 1); }
    
    public static double aexc(double x) { return Trigonometry.arccsc(x + 1); }

    public static double sinh(double x) { return Math.sinh(x); }

    public static double cosh(double x) { return Math.cosh(x); }

    public static double tanh(double x) { return Math.tanh(x); }

    public static double coth(double x) { return Trigonometry.cosh(x) / Trigonometry.sinh(x); }

    public static double sech(double x) { return 1 / Trigonometry.cosh(x); }

    public static double csch(double x) { return 1 / Trigonometry.sinh(x); }

    public static double arsinh(double x) { return Logarithm.ln(x + Math.sqrt(x * x + 1)); }

    public static double arcosh(double x) { return Logarithm.ln(x + Math.sqrt(x * x - 1)); }

    public static double artanh(double x) { return 0.5 * Logarithm.ln((x + 1) / (x - 1)); }

    public static double arcoth(double x) { return 0.5 * Logarithm.ln((x + 1) / (x - 1)); }

    public static double arsech(double x) { return Logarithm.ln(1 / x + Math.sqrt(1 / (x * x) - 1)); }

    public static double arcsch(double x) { return Logarithm.ln(1 / x + Math.sqrt(1 / (x * x) + 1)); }

    public static double arcsin(double x) { return Math.asin(x); }

    public static double arccos(double x) { return Math.acos(x); }

    public static double arctan(double x) { return Math.atan(x); }
    
    public static double arccot(double x) { return Trigonometry.arccos(x / Math.sqrt(1 + x * x)); }
    
    public static double arcsec(double x) { return Trigonometry.arccos(1 / x); }
    
    public static double arccsc(double x) { return Trigonometry.arcsin(1 / x); }
    
    public static double sinc(double x) { return Trigonometry.sin(x) / x; }
    
    public static double sinhc(double x) { return Trigonometry.sinh(x) / x; }
    
    public static double arc(double x) { return x; }
}
