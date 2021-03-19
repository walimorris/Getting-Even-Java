package com.morris.repeat.primer;

import java.util.Scanner;

public class Primer {
    public Primer() {}

    public enum Vowels {
        A('a'),
        E('e'),
        I('i'),
        O('o'),
        U('u');
        private final int value;

        Vowels(char value) {
            this.value = value;
        }
    }

    /**
     * Add punctuation chars as seen fit. Methods that utilize the Punctuations enum
     * will not be negatively affected by any additions.
     */
    public enum Punctuations {
        APOSTROPHE('\''),
        COMMA(','),
        PERIOD('.'),
        QUESTION('?'),
        EXCLAMATION('!'),
        SEMICOLON(';'),
        COLON(':');

        private final int value;

        Punctuations(int value) {
            this.value = value;
        }
    }

    /**
     * Write a short Java method that inputs a different value of each base
     * type from the standard input device and prints its back to the standard
     * output device. Errors are telling for incorrect base type submissions.
     *
     * @author Wali Morris<wmmorris@gmail.com>
     */
    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string type: ");
        String string = scanner.nextLine();
        System.out.println(string);
        System.out.print("Enter integer type: ");
        int integer = scanner.nextInt();
        System.out.println(integer);
        System.out.print("Enter double type: ");
        double dub = scanner.nextDouble();
        System.out.println(dub);
        System.out.print("Enter boolean type: ");
        boolean bool = scanner.nextBoolean();
        System.out.println(bool);
        System.out.print("Enter char type: ");
        char character = scanner.next().charAt(0);
        System.out.println(Character.toChars(character));
    }

    /**
     * Write a short Java method that takes two long values and returns true
     * if, and only if, n is a multiple of m.
     * @param n : integer
     * @param m : integer
     * @return : true if n is a multiple of m.
     */
    public static boolean isMultiple(int n, int m) {
        if ( n == m ) {
            return true;
        } else if ( n > m ) {
            return false;
        } else {
            for (int i = 1; i <= m; i++) {
                if (2 * i == m) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Write a short method that returns true if and only if it is even number.
     * You can not use Multiplication, Division or modulus operator.
     * @param e : integer being evaluated.
     * @return : {@link Boolean}
     */
    public static boolean isEven(int e) {
        if ( e == 0 ) {
            return true;
        }
        do {
            e -= 2;
        } while ( e > 0);
        return e == 0;
    }

    /**
     * Write a method that takes an integer n and returns the sum of all the odd
     * positive integers less than or equal to n.
     * @param n : integer
     * @return : int
     */
    public static int sumOfAllEvenPositives(int n) {
        int i = 0, sum = 0;
        boolean skip = true;      // skip begins true to skip the first odd positive integer
        while ( i <= n ) {
            if (i % 2 == 0) {     // if positive, go into decision structure, else increment
                if (!skip) {      // if even and false add n to sum and skip next positive
                    sum += i;
                    System.out.println("odd even: " + i);
                    skip = true;
                } else {
                    skip = false; // odd positive has been skipped, don't skip next positive
                }
            }
            i++;
        }
        return sum;
    }

    /**
     * Write a Jave method that takes an integer n and returns the sum of all
     * positive integers less than or equal to n.
     * @param n : integer
     * @return : int
     */
    public static int sumOfAllPositives(int n) {
        int i = 0, sum = 0;
        while ( i <= n ) {
            if ( i % 2 == 0 ) {
                sum += i;
                System.out.println("Even number: " + i);
            }
            i++;
        }
        return sum;
    }

    /**
     * Write a short method that takes an integer n and returns the sum of the
     * squares of all positive integers less than or equal to n.
     * @param n : integer
     * @return : int
     */
    public static int sumOfAllPositiveSquares(int n) {
        int i = 0, sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i * i;
                System.out.println(i + "^2: " + i * i);
            }
            i++;
        }
        return sum;
    }

    /**
     * Write a method that counts the number of vowels in a given char string.
     * @param str : {@link String}
     * @return : int
     */
    public static int countVowels(String str) {
        int sum = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            char c = str.charAt(i);
            for ( Vowels v : Vowels.values() ) {
                if ( v.value == c ) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    /**
     * Write a method that uses a {@link StringBuilder} instance to remove
     * all the punctuation from a {@link String} storing a sentence.
     * @param str : {@link String}
     * @return : {@link String}
     */
    public static String removePunctuations(String str) {
        StringBuilder string = new StringBuilder(str);
        for ( int i = 0; i < string.length(); i++ ) {
            char c = string.charAt(i);
            for ( Punctuations p : Punctuations.values() ) {
                if ( p.value == c ) {
                    string.deleteCharAt(i);
                }
            }
        }
        return string.toString();
    }

    /**
     * Write a program that takes as input three integers, a, b, c, from the
     * Java console and determines if they can be used in a correct arithmetic
     * formula. For this method we will use these possible arthimetic operators:
     * (+, -, *, /, %)
     * @param x : integer
     * @param y : integer
     * @param z : integer
     * @return : boolean
     */
    public static boolean isPossibleArithmetic(int x, int y, int z) {
        int[] array = { x, y, z };
        boolean isFoundFormula = isFoundArithmeticFormula(x, y, z);
        if ( isFoundFormula ) {
            return true;
        } else {
            for ( int i = 0; i < 2; i++ ) {
                array = rotateOne(array);
                isFoundFormula = isFoundArithmeticFormula(array[0], array[1], array[2]);
                if ( isFoundFormula ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if any formula in the first set of permutations is valid.
     * @param x : integer
     * @param y : integer
     * @param z : integer
     * @return : boolean
     */
    private static boolean checkPermOne( int x, int y, int z) {
        if ( x + y == z ) {
            return true;
        } else if ( x * y == z ) {
            return true;
        } else if ( x / y == z ) {
            return true;
        } else if ( x - y == z ) {
            return true;
        } else return x % y == z;
    }

    /**
     * Checks if any formula in the second set of permutations is valid.
     * @param x : integer
     * @param y : integer
     * @param z : integer
     * @return : boolean
     */
    private static boolean checkPermTwo(int x, int y, int z) {
        if ( x == y + z ) {
            return true;
        } else if ( x == y * z ) {
            return true;
        } else if ( x == y / z ) {
            return true;
        } else if ( x == y - z ) {
            return true;
        } else return x == y % z;
    }

    /**
     * Roatates an array once counter clock-wise.
     * @param array : contains 3 integers.
     * @return int[] array
     */
    private static int[] rotateOne(int[] array) {
        int[] arr = array;
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        return arr;
    }

    /**
     * Searches through both permuataions to find a valid arithmetic formuls.
     * @param x : integer
     * @param y : integer
     * @param z : integer
     * @return boolean
     */
    private static boolean isFoundArithmeticFormula(int x, int y, int z) {
        boolean isFoundFormula = checkPermOne(x, y, z);
        boolean isFoundFormula2 = checkPermTwo(x, y, z);
        if ( isFoundFormula || isFoundFormula2 ) {
            return true;
        }
        return false;
    }
}
