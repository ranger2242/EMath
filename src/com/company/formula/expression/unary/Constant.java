package com.company.formula.expression.unary;

/**
 * Created by tyler on 2/28/17.
 */
public class Constant implements UnaryExpression{

    public double getNumber() {

        return number;
    }

    private final double number;

    public Constant(int number) {

        this((double) number);
    }

    public Constant(double number) {

        this.number = number;
    }

    @Override
    public String toString() {

        return "" + this.getNumber();
    }
}
