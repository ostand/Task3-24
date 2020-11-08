package ru.vsu.cs.ostroverkhov;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Picture picture = new Picture(new VerticalParabola(-4, 3, 0.5),
                new HorizontalParabola(5, -4, 0.125),
                new Square(-3, 5, 3),
                new Rectangle(-3, 1, 7, 4),
                new Rectangle(-6, 1, 3, 4),
                new Rectangle(-3, 0, 3, 1));
        if (checkPointColors(picture)) {

            double x = readPointCoordinate('x');
            double y = readPointCoordinate('y');

            Point point = new Point(x, y);
            SimpleColor color = Picture.getColor(point);
            printColorForPoint(x, y, color);
        } else {
            System.out.println("Program doesn't work right.");
        }
    }

    public static boolean checkPointColors(Picture picture) {
        Test[] possibleOptions = {
                new Test(-1, 0, SimpleColor.BLUE),
                new Test(3, 2, SimpleColor.WHITE),
                new Test(-3, 4, SimpleColor.YELLOW),
                new Test(9, -2, SimpleColor.BLUE),
                new Test(-6, 8, SimpleColor.GRAY),
                new Test(-1, 6, SimpleColor.GRAY),
                new Test(-2, -5, SimpleColor.YELLOW),
                new Test(-4, 4, SimpleColor.ORANGE),
                new Test(-2, 6, SimpleColor.GREEN)};

        boolean resultOfTest = true;
        for (int i = 0; i < possibleOptions.length; i++) {

            Test test = possibleOptions[i];
            Point point = new Point(test.getX(), test.getY());
            SimpleColor color = picture.getColor(point);
            SimpleColor correctColor = test.getCorrectColor();

            if (color == correctColor) {
                printResultOfTest(point.x, point.y, color, correctColor, resultOfTest);
            } else {
                printResultOfTest(point.x, point.y, color, correctColor, resultOfTest);
                resultOfTest = false;
            }
        }
        return resultOfTest;
    }

    public static double readPointCoordinate(char coordinate) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter coordinate of %S: ", coordinate);
        return scanner.nextDouble();
    }

    public static void printColorForPoint(double x, double y, SimpleColor color) {
        System.out.printf("(%.1f; %.1f) - %s.", x, y, color);
    }

    public static void printResultOfTest(double x, double y, SimpleColor color, SimpleColor correctColor, boolean resultOfTest) {
        System.out.printf("Color for point (%.1f; %.1f) is %s. It's %s. Correct result is %s",
                x, y, color, resultOfTest, correctColor);
        System.out.println();
    }
}


