package jasd.number;

import jasd.number.logarithm.Logarithm;

public class MoreTrig
{	
	public static double sin(double x) { return Math.sin(x); }
	
	public static double cos(double x) { return Math.cos(x); }
	
	public static double tan(double x) { return Math.tan(x); }

	public static double csc(double x) { return 1 / Math.sin(x); }

	public static double sec(double x) { return 1 / Math.cos(x); }

	public static double cot(double x) { return 1 / Math.tan(x); }

	public static double crd(double x) { return 2 * Math.sin(x / 2); }

	public static double versin(double x) { return 1 - Math.cos(x); }

	public static double coversin(double x) { return 1 - Math.sin(x); }

	public static double haversin(double x) { return 0.5 * this.versin(x); }

	public static double exsec(double x) { return this.sec(x) - 1; }

	public static double excsc(double x) { return this.exsec(Math.PI / 2 - x); }

	public static double sinh(double x) { return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / 2; }

	public static double cosh(double x) { return (Math.pow(Math.E, x) + Math.pow(Math.E, -x)) / 2; }

	public static double tanh(double x) { return this.sinh(x) / this.cosh(x); }

	public static double coth(double x) { return this.cosh(x) / this.sinh(x); }

	public static double sech(double x) { return 1 / this.cosh(x); }

	public static double csch(double x) { return 1 / this.sinh(x); }

	public static double arsinh(double x) { return this.l.ln(x + Math.sqrt(x * x + 1)); }

	public static double arcosh(double x) { return this.l.ln(x + Math.sqrt(x * x - 1)); }

	public static double artanh(double x) { return 0.5 * this.l.ln((x + 1) / (x - 1)); }

	public static double arcoth(double x) { return 0.5 * this.l.ln((x + 1) / (x - 1)); }

	public static double arsech(double x) { return this.l.ln(1 / x + Math.sqrt(1 / (x * x) - 1)); }

	public static double arcsch(double x) { return this.l.ln(1 / x + Math.sqrt(1 / (x * x) + 1)); }
	
	public static double arcsin(double x) { return Math.asin(x); }
	
	public static double arccos(double x) { return Math.acos(x); }
	
	public static double arctan(double x) { return Math.atan(x); }
}
