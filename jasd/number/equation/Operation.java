package jasd.number.equation;

public abstract class Operation
{
    protected double a = 0;
    protected double b = 0;
    protected Operation o, p;
    protected final byte c;

    protected Operation() { this.c = 4; }

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

    abstract double evaluate();

    public Operation getOperation() { return this; }

    public void addVariableKey(VariableKey vk)
    {
        if (c == 1) { this.p.setValue(vk); }
        else if (c == 2) { this.o.setValue(vk); }
        else
        {
            this.o.setValue(vk);
            this.p.setValue(vk);
        }
    }

    public abstract String toString();

    abstract void setValue(VariableKey vk);

    
}
