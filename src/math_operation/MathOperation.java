package math_operation;

public class MathOperation {
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number && isPrime; i++) {
            if (isDivisor(number, i)) {
                isPrime = false; // There should only be two divisors for a number, 1 and the number.
                break;
            }
        }

        return isPrime;
    }

    public static boolean isDivisor(int dividend, int divisor) {
        return (dividend % divisor == 0) ? true : false;
    }
}
