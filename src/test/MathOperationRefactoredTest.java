package test;

import math_operation.MathOperationRefactored;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationRefactoredTest {

    @Test
    void isPrime_withAPrimeNumber_returnTrue() {
        Assertions.assertTrue(MathOperationRefactored.isPrime(7));
    }

    @Test
    void isPrime_withACompositeNumber_returnFalse() {
        Assertions.assertFalse(MathOperationRefactored.isPrime(8));
    }

    @Test
    void isDivisor_withAValidDivisor_returnTrue() {
        Assertions.assertTrue(MathOperationRefactored.isDivisor(4,2));
    }

    @Test
    void isDivisor_withAInValidDivisor_returnFalse() {
        Assertions.assertFalse(MathOperationRefactored.isDivisor(5,3));
    }
}