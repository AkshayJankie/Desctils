package io.github.akshayjankie;


/**
 *  * Licensed under Creative Commons Attribution-NonCommercial 4.0 International (CC BY-NC 4.0).
 *  * You may not use this file for commercial purposes.
 *  * See: <a href="https://creativecommons.org/licenses/by-nc/4.0/">...</a>
 * PointUtil class with helper functions
 * @author Akshay Jankie
 */

public final class PointUtil {

    private PointUtil() {
    }


    /**
     * Multiply two integers together
     * @param a the first number
     * @param b the second number
     * @return the result
     */
    public static int multiply(int a, int b) {
        return a * b;
    }


    /**
     * Divide two integers
     * @param a the first number
     * @param b the second number
     * @return the result
     */
    public static int divide(int a, int b) {
        return a / b;
    }
}