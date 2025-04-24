package Project.example3;

import jdk.incubator.vector.VectorOperators;

public enum OperatorType {
    SUM('+'),
    SUB('-'),
    MUL('X'),
    DIV('/'),
    MOD('%');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
