package formula;

import java.util.HashMap;
import java.util.Stack;

// This solution is more object-oriented
public class FormulaRefactored {
    private String formula;
    private Stack<Character> charStack;
    private HashMap<Character, Character> charMap;

    // Constructors
    public FormulaRefactored() {
        this.charStack = new Stack<>();
        this.charMap = new HashMap<>();
    }

    public void initMap() {
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');
    }

    public boolean isOpeningCharacter(Character character) {
        return charMap.containsValue(character);
    }

    public boolean isClosingCharacter(Character character) {
        return charMap.containsKey(character);
    }

    public Character getOposite(Character character) {
        return charMap.get(character);
    }

    public boolean isBalanced() {
        boolean isBalanced = false;
        Character c;

        if(formula == null) {
            return isBalanced;
        }

        for (int i = 0; i < formula.length(); i++) {
            c = formula.charAt(i);

            if (isOpeningCharacter(c)) {
                charStack.push(c);
            } else if (isClosingCharacter(c) && !charStack.isEmpty()) {
                if (charStack.pop() == getOposite(c)) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        return isBalanced;
    }

    // Getters & setters..
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Stack<Character> getCharStack() {
        return charStack;
    }

    public void setCharStack(Stack<Character> charStack) {
        this.charStack = charStack;
    }

    public HashMap<Character, Character> getCharMap() {
        return charMap;
    }

    public void setCharMap(HashMap<Character, Character> charMap) {
        this.charMap = charMap;
    }
}
