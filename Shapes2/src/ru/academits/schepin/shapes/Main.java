package ru.academits.schepin.shapes;

import static ru.academits.schepin.shapes.ShapeUtilities.findMaximumArea;
import static ru.academits.schepin.shapes.ShapeUtilities.findSecondMaximumPerimeter;
import static ru.academits.schepin.shapes.ShapeUtilities.getNameOfShape;


public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(2);
        Square square2 = new Square(4);

        Rectangle rectangle1 = new Rectangle(5, 21);
        Rectangle rectangle2 = new Rectangle(5, 21);

        Triangle triangle1 = new Triangle(5, 3, 2, 8, 50, 3);
        Triangle triangle2 = new Triangle(8, 2, 5, 20, 15, 21);

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(3);

        Shape[] allShapes = new Shape[8];
        allShapes[0] = square1;
        allShapes[1] = square2;
        allShapes[2] = rectangle1;
        allShapes[3] = rectangle2;
        allShapes[4] = triangle1;
        allShapes[5] = triangle2;
        allShapes[6] = circle1;
        allShapes[7] = circle2;

        for (int i = 0; i < allShapes.length; i++) {
            System.out.println(allShapes[i]);
        }

        //Определение max площади и второго max периметра:
        System.out.println();
        Shape shapeWithMaxArea = findMaximumArea(allShapes);
        Shape shapeWithSecondMaxPerimeter = findSecondMaximumPerimeter(allShapes);
        System.out.format("\nМаксимальная площадь = %.3f -> %s\n", shapeWithMaxArea.getArea(), shapeWithMaxArea);
        System.out.format("Второй по максимуму периметр = %.3f -> %s\n\n", shapeWithSecondMaxPerimeter.getPerimeter(), shapeWithSecondMaxPerimeter);

        System.out.println();
        System.out.println("Все хэш-коды:");

        for(int i = 0; i < allShapes.length; i++){
            System.out.print(allShapes[i]);
            System.out.println(" -> " + allShapes[i].hashCode());
        }
    }
}
