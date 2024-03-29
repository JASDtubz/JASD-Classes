package jasd.annotations;

/**
 * This annotation is used for classes that have a method {@code copy()} that makes a direct clone of their object,
 * returning their type rather than {@code Object}.
 *
 * @author Jean-Denis Toting de Beauvoir
 * @version 2022.09.22.14.02
 */
public @interface Copyable
{
    /**
     * Used for the method {@code copy()} which returns a clone of their object.
     */
    boolean copyMethod() default false;
 
    /**
     * Used for the class with a {@code copy()} method that returns a clone of their object.
     */
    boolean hasCopyMethod() default false;
}
