/*
 * This program pushes and prints a stack.
 *
 * @author  Abdul Basit
 * @version 1.0
 * @since   2022-02-03
 */

/** This program demonstrates a stack. */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates an instance of MrCoxallStack and uses its methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        final int number1 = 7;
        final int number2 = 42;

        aStack.push(number1);
        aStack.push(number2);
        aStack.showStack();

        System.out.println("Done.");
    }
}
