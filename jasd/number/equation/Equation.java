package jasd.number.equation;

public class Equation
{
    private Operation o;

    /**
     * Object initialization parameters are not needed here since everything can be added later.
     */
    public Equation() { }

    /**
     * Clears the Equation of all data.
     */
    public void reset() { this.o = null; }

    /**
     * Adds a Variable to the Equation.
     * @param s Name of the variable.
     */
    public void addVariable(String s) { this.o = new Variable(s); }

    public void addVariableKey(VariableKey vk) { this.o.addVariableKey(vk); }

    /**
     * Creates an Addition Equation for use with <i>doubles</i> as terms.
     * @param i Leftmost term.
     * @param j Rightmost term.
     */
    public void addAddition(double i, double j) { this.o = new Addition(i, j); }

    /**
     * Creates an Addition Equation for use with Equations as terms.
     * @param o Leftmost term.
     * @param p Rightmost term.
     */
    public void addAddition(Equation o, Equation p) { this.o = new Addition(o.getOperation(), p.getOperation()); }

    /**
     * Creates an Addition Equation for use with a <i>double</i> as the left term and an Equation as the right term.
     * @param i Leftmost term.
     * @param o Rightmost term.
     */
    public void addAddition(double i, Equation o) { this.o = new Addition(i, o.getOperation()); }

    /**
     * Creates an Addition Equation for use with an Equation as the left term and a <i>double</i> as the left term.
     * @param o Rightmost term.
     * @param i Leftmost term.
     */
    public void addAddition(Equation o, double i) { this.o = new Addition(o.getOperation(), i); }

    /**
     * Extends the current equation to an Addition Equation using a <i>double</i> as a term.
     * @param i Added term value.
     */
    public void addAddition(double i) { this.o = new Addition(this.o.getOperation(), i); }

    /**
     * Extends the current equation to an Addition Equation using an Equation as a term.
     * @param o Added Equation.
     */
    public void addAddition(Equation o) { this.o = new Addition(this.o.getOperation(), o.getOperation()); }

    public void addSubtraction(double i, double j) { this.o = new Subtraction(i, j); }

    public void addSubtraction(Equation o, Equation p) { this.o = new Subtraction(o.getOperation(), p.getOperation()); }

    public void addSubtraction(double i, Equation o) { this.o = new Subtraction(i, o.getOperation()); }

    public void addSubtraction(Equation o, double i) { this.o = new Subtraction(o.getOperation(), i); }

    public void addSubtraction(double i) { this.o = new Subtraction(this.o.getOperation(), i); }

    public void addSubtraction(Equation o) { this.o = new Subtraction(this.o.getOperation(), o.getOperation()); }

    public void addMultiplication(double i, double j) { this.o = new Multiplication(i, j); }

    public void addMultiplication(Equation o, Equation p) { this.o = new Multiplication(o.getOperation(), p.getOperation()); }

    public void addMultiplication(double i, Equation o) { this.o = new Multiplication(i, o.getOperation()); }

    public void addMultiplication(Equation o, double i) { this.o = new Multiplication(o.getOperation(), i); }

    public void addMultiplication(double i) { this.o = new Multiplication(this.o.getOperation(), i); }

    public void addMultiplication(Equation o) { this.o = new Multiplication(this.o.getOperation(), o.getOperation()); }

    public void addDivision(double i, double j) { this.o = new Division(i, j); }

    public void addDivision(Equation o, Equation p) { this.o = new Division(o.getOperation(), p.getOperation()); }

    public void addDivision(double i, Equation o) { this.o = new Division(i, o.getOperation()); }

    public void addDivision(Equation o, double i) { this.o = new Division(o.getOperation(), i); }

    public void addDivision(double i) { this.o = new Division(this.o.getOperation(), i); }

    public void addDivision(Equation o) { this.o = new Division(this.o.getOperation(), o.getOperation()); }

    public void addExponentiation(double i, double j) { this.o = new Exponentiation(i, j); }

    public void addExponentiation(Equation o, Equation p) { this.o = new Exponentiation(o.getOperation(), p.getOperation()); }

    public void addExponentiation(double i, Equation o) { this.o = new Exponentiation(i, o.getOperation()); }

    public void addExponentiation(Equation o, double i) { this.o = new Exponentiation(o.getOperation(), i); }

    public void addExponentiation(double i) { this.o = new Exponentiation(this.o.getOperation(), i); }

    public void addExponentiation(Equation o) { this.o = new Exponentiation(this.o.getOperation(), o.getOperation()); }

    public double evaluate() { return this.o.evaluate(); }

    public String toString() { return this.o.toString(); }

    private Operation getOperation() { return this.o.getOperation(); }
}
