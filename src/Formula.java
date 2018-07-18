import java.util.Stack;

public class Formula {
    private Stack<Character> stack = new Stack<Character>();

    private String formula;

    public Formula(String formula) {
        this.formula = formula;
    }

    public boolean isOpeningCharacter(Character character) {
        switch (character) {
            case '{':
                return true;
            case '[':
                return true;
            case '(':
                return true;
            default:
                return false;
        }
    }

    public boolean isClosingCharacter(Character character) {
        switch (character) {
            case '}':
                return true;
            case ']':
                return true;
            case ')':
                return true;
            default:
                return false;
        }
    }

    public Character getComplementaryCharacter(Character openingCharacter) {
        switch (openingCharacter) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
            default:
                    return null;
        }
    }

    public boolean isBalanced() {
        boolean isBalanced = false;

        for(int i=0; i<formula.length();i++) {
            Character character = formula.charAt(i);

            if (isOpeningCharacter(character)) {
                stack.push(character);
            }

            if(isClosingCharacter(character) && !stack.isEmpty()) {
                Character openingCharacter = stack.pop();
                if(getComplementaryCharacter(openingCharacter) == character) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        return isBalanced;
    }
}
