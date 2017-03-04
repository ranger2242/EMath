package com.company;

/**
 * Created by Chris Cavazos on 2/14/2017.
 */
public class Main {
    int a, b, c, d, e;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        double d = EMath.pathag(new Vector2(0, 0), new Vector2(1, 1));
        System.out.print(d);


    }

    public static void out(String str) {
        System.out.print(str);

    }
}
