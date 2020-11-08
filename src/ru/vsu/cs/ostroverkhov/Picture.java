package ru.vsu.cs.ostroverkhov;

public class Picture {
    static Square square;
    static Rectangle rightRectangle;
    static Rectangle leftRectangle;
    static Rectangle lowerRectangle;
    static VerticalParabola verticalParabola;
    static HorizontalParabola horizontalParabola;

    public Picture(VerticalParabola verticalParabola,
                   HorizontalParabola horizontalParabola,
                   Square square,
                   Rectangle rightRectangle,
                   Rectangle leftRectangle,
                   Rectangle lowerRectangle) {
        this.verticalParabola = verticalParabola;
        this.horizontalParabola = horizontalParabola;
        this.square = square;
        this.rightRectangle = rightRectangle;
        this.leftRectangle = leftRectangle;
        this.lowerRectangle = lowerRectangle;

    }

    public static SimpleColor getColor(Point point) {
        double x = point.x;
        double y = point.y;

        if ((verticalParabola.IsPointInside(x, y) && square.isPointInside(x, y))) {
            return SimpleColor.GREEN;
        }

        if ((verticalParabola.IsPointInside(x, y) && rightRectangle.isPointInside(x, y))) {
            return SimpleColor.YELLOW;
        }

        if ((verticalParabola.IsPointInside(x, y) && leftRectangle.isPointInside(x, y))) {
            return SimpleColor.ORANGE;
        }

        if ((verticalParabola.IsPointInside(x, y))) {
            return SimpleColor.GRAY;
        }

        if ((square.isPointInside(x, y))) {
            return SimpleColor.GRAY;
        }

        if ((lowerRectangle.isPointInside(x, y))) {
            return SimpleColor.BLUE;
        }

        if ((horizontalParabola.IsPointInside(x, y))) {
            return SimpleColor.BLUE;
        }

        if ((rightRectangle.isPointInside(x, y)) || leftRectangle.isPointInside(x, y)) {
            return SimpleColor.WHITE;
        }

        return SimpleColor.YELLOW;
    }
}