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

        /**
         * Collect the sum of all even positives.
         */
        int number0 = 20;
        int sum0 = Primer.sumOfAllEvenPositives(number0);
        System.out.println("Sum of all even positives of " + number0 + ": " + sum0);

        /**
         * Collect the sum of all positive numbers.
         */
        int number1 = 32;
        int sum1 = Primer.sumOfAllPositives(number1);
        System.out.println("Sum of all positives of " + number1 + ": " + sum1);

        /**
         * Collect the sum of all positive squares of a number.
         */
        int number2 = 18;
        int sum2 = Primer.sumOfAllPositiveSquares(number2);
        System.out.println("Sum of all positives squares of " + number2 + ": " + sum2);

        /**
         * Collect the sum of all vowels in a string.
         */
        String str = "This is a string with 7 vowels";
        int sum3 = Primer.countVowels(str);
        System.out.println("Sum of vowels in " + "`" + str + "`" + ": " + sum3);

        /**
         * Transform a String value and remove all punctuations.
         */
        String str2 = "Let's try, Mike!";
        String str2Value = Primer.removePunctuations(str2);
        System.out.println(str2 + " => " + str2Value);
    }
}
