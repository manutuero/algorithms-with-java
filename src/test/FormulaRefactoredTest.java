package test;

import formula.FormulaRefactored;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/* If you are using IntelliJ IDEA press Ctrl+Shift+F10 to run this test file.
*  These tests run with Formula Refactored class */
class FormulaRefactoredTest {

    private static FormulaRefactored formula; // must be static

    @BeforeAll
    static void setUp() {
        formula = new FormulaRefactored();
        formula.initMap();
    }

    @Test
    void isOpeningCharacter_withOpeningCharacter_returnTrue() {
        Assertions.assertTrue(formula.isOpeningCharacter('('));
    }

    @Test
    void isOpeningCharacter_withAnotherCharacter_returnFalse() {
        Assertions.assertFalse(formula.isOpeningCharacter('x'));
    }

    @Test
    void isClosingCharacter_withClosingCharacter_returnTrue() {
        Assertions.assertTrue(formula.isClosingCharacter(']'));
    }

    @Test
    void isClosingCharacter_withAnotherCharacter_returnFalse() {
        Assertions.assertFalse(formula.isOpeningCharacter('y'));
    }

    @Test
    void isBalanced_withABalancedFormula_returnTrue() {
        formula.setFormula("{([])}");
        Assertions.assertTrue(formula.isBalanced());
    }

    @Test
    void isBalanced_withAUnbalancedFormula_returnFalse() {
        formula.setFormula("{)}");
        Assertions.assertFalse(formula.isBalanced());
    }

    @Test
    void isBalanced_withANull_returnFalse() {
        Assertions.assertFalse(formula.isBalanced());
    }
}