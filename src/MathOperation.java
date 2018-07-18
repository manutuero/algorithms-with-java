public class MathOperation {
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number && isPrime; i++) {
            if (isDivisor(i,number)) {
                isPrime = false; // There should only be two divisors for a number, 1 and the number.
                break;
            }
        }

        return isPrime;
    }

    public static boolean isDivisor(int divisor, int dividend) {
        return (dividend % divisor == 0) ? true : false;
    }
}
