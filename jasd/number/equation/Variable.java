package jasd.number.equation;

final class Variable extends Operation
{
    private final String s;
    private double d;
    private boolean b;

    public Variable(String s)
    {
        super();
        this.s = s;
    }

    @Override
    void setValue(VariableKey vk)
    {
        if (this.s.equals(vk.s))
        {
            this.d = vk.d;
            this.b = true;
        }
    }

    @Override
    double evaluate()
    {
        if (!b) { System.err.println("Value of '" + this.s + "' has not been initialized."); }
        else { return this.d; }

        return Double.NaN;
    }

    public String toString() { return this.s; }
}
