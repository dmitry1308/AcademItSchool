package ru.academits.schepin.shapes;

public class Square implements Shape {

    private double side;

    public Square(double side) {

        this.side = side;
    }


    @Override
    public double getWidth() {

        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {

        return "Квадрат со стороной = " + side;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Square) {

            Square sq = (Square) o;

            if (this.side == sq.side) {

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

        return 31 * (int) side;
    }
}

