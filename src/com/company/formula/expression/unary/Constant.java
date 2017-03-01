package com.company.formula.expression.unary;

import java.math.BigDecimal;

/**
 * Created by tyler on 2/28/17.
 */
public class Constant implements UnaryExpression{

    public BigDecimal getConstant() {

        return number;
    }

    public String getConstant(int sigFigs) {

        // TODO
        return "";
    }

    private final BigDecimal number;

    public Constant(int number) {

        this((double) number);
    }

    public Constant(double number) {

        this(new BigDecimal(number));
    }

    public Constant(String number) {

        this(new BigDecimal(number));
    }

    public Constant(BigDecimal number) {

        this.number = number;
    }

    @Override
    public String toString() {

        return "" + this.getConstant();
    }
}
