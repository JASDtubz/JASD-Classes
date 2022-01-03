package jasd.number.equation;

public class Addition extends Operation
{
    public Addition(double i, double j) { super(i, j); }

    public Addition(double i, Operation o) { super(i, o); }

    public Addition(Operation o, double i) { super(o, i); }

    public Addition(Operation o, Operation p) { super(o, p); }

    @Override
    double evaluate()
    {
        switch (super.c)
        {
            case 0: return super.a + super.b;
            case 1: return super.a + super.p.evaluate();
            case 2: return super.o.evaluate() + super.b;
            default: return super.o.evaluate() + super.p.evaluate();
        }
    }

    @Override
    public String toString()
    {
        switch (super.c)
        {
            case 0: return String.format("(%s+%s)", super.a, super.b);
            case 1: return String.format("(%s+%s)", super.a, super.p);
            case 2: return String.format("(%s+%s)", super.o, super.b);
            default: return String.format("(%s+%s)", super.o, super.p);
        }
    }

    /**
     * Ignore
     */
    @Override
    void setValue(VariableKey vk) { }
}
