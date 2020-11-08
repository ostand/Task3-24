package ru.vsu.cs.ostroverkhov;

public class Rectangle {
    private double x0;
    private double y0;
    private double a;
    private double b;

    public Rectangle(double x0, double y0, double a, double b) {

        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
        this.b = b;

    }

    public boolean isPointInside(double x, double y) {

        return (x >= x0) && (x <= (x0 + a)) && (y >= y0) && (y <= (y0 + b));

    }
}
