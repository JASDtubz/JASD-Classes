package jasd.number.equation;

final class Exponentiation extends Operation
{
    public Exponentiation(double i, double j) { super(i, j); }

    public Exponentiation(double i, Operation o) { super(i, o); }

    public Exponentiation(Operation o, double i) { super(o, i); }

    public Exponentiation(Operation o, Operation p) { super(o, p); }

    @Override
    double evaluate()
    {
        switch (super.c)
        {
            case 0: return StrictMath.pow(super.a, super.b);
            case 1: return StrictMath.pow(super.a, super.p.evaluate());
            case 2: return StrictMath.pow(super.o.evaluate(), super.b);
            default: return StrictMath.pow(super.o.evaluate(), super.p.evaluate());
        }
    }

    @Override
    public String toString()
    {
        switch (super.c)
        {
            case 0: return String.format("(%s^%s)", super.a, super.b);
            case 1: return String.format("(%s^%s)", super.a, super.p);
            case 2: return String.format("(%s^%s)", super.o, super.b);
            default: return String.format("(%s^%s)", super.o, super.p);
        }
    }

    @Override
    void setValue(VariableKey vk) { }
}
