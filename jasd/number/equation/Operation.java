package jasd.number.equation;

abstract class Operation
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
        switch (this.c)
        {
            case 1:
                if (this.p.getC() == 4) { this.p.setValue(vk); }
                else { this.p.addVariableKey(vk); }
                    
                break;
            case 2:
                if (this.o.getC() == 4) { this.o.setValue(vk); }
                else { this.o.addVariableKey(vk); }
                
                break;
            case 3:
                if (this.o.getC() == 4) { this.o.setValue(vk); }
                else { this.o.addVariableKey(vk); }
                
                if (this.p.getC() == 4) { this.o.setValue(vk); }
                else { this.p.addVariableKey(vk); }
        }
    }

    public abstract String toString();

    abstract void setValue(VariableKey vk);

    byte getC() { return this.c; }
}
