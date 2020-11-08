package ru.vsu.cs.ostroverkhov;

public class Square {
    private double x0;
    private double y0;
    private double a;

    public Square(double x0, double y0, double a) {

        this.x0 = x0;
        this.y0 = y0;
        this.a = a;

    }

    public boolean isPointInside(double x, double y) {

        return (x >= x0) && (x <= (x0 + a)) && (y >= y0) && (y <= (y0 + a));

    }
}