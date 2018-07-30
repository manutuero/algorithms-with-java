package math_operation;

import java.util.stream.IntStream;

public class MathOperationRefactored {

    public static boolean isPrime(int number) {
        return IntStream
                .rangeClosed(1, number)
                .filter(n -> isDivisor(number, n))
                .count() == 2; // Only can have 2 divisors
    }

    public static boolean isDivisor(int dividend, int divisor) { return dividend % divisor == 0; }
}
