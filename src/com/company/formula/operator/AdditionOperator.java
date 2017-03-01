package com.company.formula.operator;

import com.company.formula.Symbol;

/**
 * Created by tyler on 2/28/17.
 */
public class AdditionOperator extends Operator {

    private final static Symbol SYMBOL = new Symbol("+");

    public Symbol getSymbol() {

        return SYMBOL;
    }
}
