package ru.vsu.cs.ostroverkhov;

public class Test {
    double x;
    double y;
    SimpleColor correctColor;

    public Test(double x, double y, SimpleColor correctColor) {
        this.x = x;
        this.y = y;
        this.correctColor = correctColor;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public SimpleColor getCorrectColor() {
        return correctColor;
    }
}