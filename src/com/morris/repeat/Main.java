package com.morris.repeat;

import com.morris.repeat.primer.Primer;

public class Main {
    public static void main(String[] args) {

        /**
         * Reads base types as input and outputs to stdout.
         */
        Primer.inputAllBaseTypes();

        /**
         * Check multiples.
         */
        boolean multiples = Primer.isMultiple(2, 13);
        System.out.println(multiples);

        /**
         * Evaluates 101 numbers.
         */
        int e = 100;
        while ( e >= 0) {
            boolean evens = Primer.isEven(e);
            System.out.println(e + ": " + evens);
            e--;
        }
    }
}
