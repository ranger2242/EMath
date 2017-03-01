package com.company.formula.expression.unary;

import com.company.formula.Symbol;

/**
 * Created by tyler on 3/1/17.
 */
public class Variable implements UnaryExpression {

    public Symbol getSymbol() {
        return symbol;
    }

    private final Symbol symbol;

    public Variable(Symbol symbol) {

        this.symbol = symbol;
    }

    @Override
    public String toString() {

        return "" + this.getSymbol();
    }
}
