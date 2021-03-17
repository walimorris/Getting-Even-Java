package com.morris.repeat.primer;

import java.util.Scanner;

public class Primer {
    public Primer() {}

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
}
