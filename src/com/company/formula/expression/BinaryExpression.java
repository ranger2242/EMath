package com.company.formula.expression;

import com.company.formula.operator.Operator;

/**
 * Created by tyler on 2/28/17.
 */
public class BinaryExpression implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    public Operator getOperator() {
        return operator;
    }

    private final Operator operator;

    public Expression getExpression1() {
        return expression1;
    }

    public BinaryExpression(Expression expression1, Operator operator, Expression expression2) {
        this.expression1 = expression1;
        this.operator = operator;
        this.expression2 = expression2;
    }

    public Expression getExpression2() {
        return expression2;
    }


}
