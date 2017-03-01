package com.company.formula;

import com.company.formula.expression.Expression;

/**
 * Created by tyler on 3/1/17.
 */
public class Equation {

    private final static Symbol SYMBOL = new Symbol("=");

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Equation(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public String toString() {

        return this.getLeftExpression() + " " + SYMBOL + " " + this.getRightExpression();
    }
}
