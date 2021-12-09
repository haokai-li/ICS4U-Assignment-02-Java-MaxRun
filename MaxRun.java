/*
* The "MaxRun" program, just proves you can show print to terminal.
*
* @author  Haokai
* @version 1.0
* @since   2021-12-09
*
*/

import java.util.Scanner;

/**
* This is the standard "MaxRun" program.
*/
final class MaxRun {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate function.
    *
    * @param originalString
    *
    * @return calculate
    */

    static int calculate(final String originalString) {
        int maxRun = 1;
        int maxRunFinal = 0;
        final int stringLength = originalString.length();
        if (stringLength == 0) {
            maxRunFinal = -1;
        } else if (stringLength == 1) {
            maxRunFinal = maxRun;
        } else {
            for (int iLoop = 1; iLoop < stringLength; iLoop++) {
                if (originalString.charAt(iLoop)
                    == originalString.charAt(iLoop - 1)) {
                    maxRun += 1;
                } else {
                    maxRun = 1;
                }

                if (maxRun >= maxRunFinal) {
                    maxRunFinal = maxRun;
                }
            }
        }
        return maxRunFinal;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            // input
            final Scanner input = new Scanner(System.in);
            System.out.print("The original String is : ");
            final String originalString = input.nextLine();

            final int sum = calculate(originalString);
            System.out.println("");
            System.out.println("The max run is : " + sum);

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something was error.");
        }
        System.out.println("\nDone.");
    }
}
