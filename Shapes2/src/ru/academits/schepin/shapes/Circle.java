package ru.academits.schepin.shapes;


public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }


    @Override
    public double getWidth() {
        return radius * 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        return ("Круг c радиусом = " + radius);
    }


    @Override
    public boolean equals(Object o) {

        if (o instanceof Circle) {

            Circle c = (Circle) o;

            if (this.radius == c.radius) {

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

        return 31 * (int) radius;
    }
}
