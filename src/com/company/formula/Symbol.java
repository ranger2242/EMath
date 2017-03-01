package com.company.formula;

/**
 * Created by tyler on 3/1/17.
 * Encapsulates a string, representing a symbol in an expression (ex. "x", "+", "inf", etc.)
 */
public class Symbol {

    public String getSymbol() {
        return symbol;
    }

    private final String symbol;

    public Symbol(String symbol) {

        this.symbol = symbol;
    }
}
