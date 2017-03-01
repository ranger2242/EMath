package com.company.formula.operator;

import com.company.formula.Symbol;

/**
 * Created by tyler on 2/28/17.
 */
public abstract class Operator {

    public abstract Symbol getSymbol();

    @Override
    public String toString() {

        return "" + this.getSymbol();
    }
}
