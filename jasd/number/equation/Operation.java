package jasd.number.equation;

public abstract class Operation
{
    protected double a = 0;
    protected double b = 0;
    protected Operation o, p;
    protected final byte c;

    protected Operation(double i, double j)
    {
        this.a = i;
        this.b = j;
        this.c = 0;
    }

    protected Operation(double i, Operation p)
    {
        this.a = i;
        this.p = p;
        this.c = 1;
    }

    protected Operation(Operation o, double j)
    {
        this.b = j;
        this.o = o;
        this.c = 2;
    }

    protected Operation(Operation o, Operation p)
    {
        this.o = o;
        this.p = p;
        this.c = 3;
    }

    public abstract double evaluate();

    public Operation getOperation() { return this; }

    public abstract String toString();
}
