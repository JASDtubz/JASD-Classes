package jasd.number.trigonometry;

import jasd.number.logarithm.Logarithm;

public class MoreTrig
{
	Logarithm l = new Logarithm();
	
	public double sin(double x) { return Math.sin(x); }
	
	public double cos(double x) { return Math.cos(x); }
	
	public double tan(double x) { return Math.tan(x); }

	public double csc(double x) { return 1 / Math.sin(x); }

	public double sec(double x) { return 1 / Math.cos(x); }

	public double cot(double x) { return 1 / Math.tan(x); }

	public double crd(double x) { return 2 * Math.sin(x / 2); }

	public double versin(double x) { return 1 - Math.cos(x); }

	public double coversin(double x) { return 1 - Math.sin(x); }

	public double haversin(double x) { return 0.5 * this.versin(x); }

	public double exsec(double x) { return this.sec(x) - 1; }

	public double excsc(double x) { return this.exsec(Math.PI / 2 - x); }

	public double sinh(double x) { return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / 2; }

	public double cosh(double x) { return (Math.pow(Math.E, x) + Math.pow(Math.E, -x)) / 2; }

	public double tanh(double x) { return this.sinh(x) / this.cosh(x); }

	public double coth(double x) { return this.cosh(x) / this.sinh(x); }

	public double sech(double x) { return 1 / this.cosh(x); }

	public double csch(double x) { return 1 / this.sinh(x); }

	public double arsinh(double x) { return this.l.ln(x + Math.sqrt(x * x + 1)); }

	public double arcosh(double x) { return this.l.ln(x + Math.sqrt(x * x + 1)); }

	public double artanh(double x) { return 0.5 * this.l.ln((1 + x) / (1 - x)); }

	public double arcoth(double x) { return 0.5 * this.l.ln((x + 1) / (x - 1)); }

	public double arsech(double x) { return this.l.ln(1 / x + Math.sqrt(1 / (x * x) - 1)); }

	public double arcsch(double x) { return this.l.ln(1 / x + Math.sqrt(1 / (x * x) + 1)); }
}
