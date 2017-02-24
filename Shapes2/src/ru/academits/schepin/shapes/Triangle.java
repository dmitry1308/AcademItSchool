package ru.academits.schepin.shapes;


public class Triangle implements Shape {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }


    @Override
    public double getWidth() {

        double xR = x1;
        if (x2 > x1) {

            xR = x2;
        }
        if (x3 > xR) {

            xR = x3;
        }

        double xL = x1;
        if (x2 < x1) {

            xL = x2;
        }
        if (x3 < xL) {

            xL = x3;
        }

        return xR - xL;
    }

    @Override
    public double getHeight() {

        double yU = y1;
        if (y2 > y1) {

            yU = y2;
        }
        if (y3 > yU) {

            yU = y3;
        }

        double yD = y1;
        if (y2 < y1) {

            yD = y2;
        }
        if (y3 < yD) {

            yD = y3;
        }

        return yU - yD;
    }

    @Override
    public double getArea() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        return a + b + c;
    }

    @Override
    public String toString() {

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));


        return String.format("Треугольник со сторонами: %.3f x %.3f x %.3f", a, b, c);
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Triangle) {

            Triangle c = (Triangle) o;

            if (this.x1 == c.x1 && this.y1 == c.y1 && this.x2 == c.x2 && this.y2 == c.y2 && this.x3 == c.x3 && this.y3 == c.y3) {

                return true;
            } else {

                return false;
            }
        } else {

            return false;
        }
    }

    @Override
    public int hashCode() {

        return 31 * (int) x1 + 117 * (int) y1 + 31 * (int) x2 + 117 * (int) y2 + 31 * (int) x3 + 117 * (int) y3;
    }
}










