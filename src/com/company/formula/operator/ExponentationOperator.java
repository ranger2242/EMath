package com.company.formula.operator;

import com.company.formula.Symbol;

/**
 * Created by tyler on 3/1/17.
 */
public class ExponentationOperator extends Operator {

    private final static Symbol SYMBOL = new Symbol("^");

    public Symbol getSymbol() {

        return SYMBOL;
    }
}
