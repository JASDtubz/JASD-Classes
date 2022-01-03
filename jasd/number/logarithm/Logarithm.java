package jasd.number.logarithm;

public class Logarithm
{
	public double logBase(x, y) { return Math.log(y) / Math.log(x); }

	public double lg(x) { return Math.log(x); }

	public double ln(x) { return Math.exp(x); }

	public double lb(x) { return this.logBase(2, x); }
}
