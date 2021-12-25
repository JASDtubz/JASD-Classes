package jasd.number.equation;

public class Subtraction extends Operation
{
    public Subtraction(double i, double j) { super(i, j); }

    public Subtraction(double i, Operation o) { super(i, o); }

    public Subtraction(Operation o, double i) { super(o, i); }

    public Subtraction(Operation o, Operation p) { super(o, p); }

    @Override
    public double evaluate()
    {
        switch (super.c)
        {
            case 0: return super.a - super.b;
            case 1: return super.a - super.p.evaluate();
            case 2: return super.o.evaluate() - super.b;
            default: return super.o.evaluate() - super.p.evaluate();
        }
    }

    @Override
    public String toString()
    {
        switch (super.c)
        {
            case 0: return String.format("(%s-%s)", super.a, super.b);
            case 1: return String.format("(%s-%s)", super.a, super.p);
            case 2: return String.format("(%s-%s)", super.o, super.b);
            default: return String.format("(%s-%s)", super.o, super.p);
        }
    }
}
