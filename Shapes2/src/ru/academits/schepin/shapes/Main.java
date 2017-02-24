package ru.academits.schepin.shapes;

import static ru.academits.schepin.shapes.ShapeUtilities.findMaximumArea;
import static ru.academits.schepin.shapes.ShapeUtilities.findSecondMaximumPerimeter;
import static ru.academits.schepin.shapes.ShapeUtilities.getNameOfShape;


public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(2);
        Square square2 = new Square(4);

        Rectangle rectangle1 = new Rectangle(5, 21);
        Rectangle rectangle2 = new Rectangle(5, 200);

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

            // System.out.format("Тип: %s, Площадь: %.3f, Периметр: %.3f\n", getNameOfShape(allShapes[i]), allShapes[i].getArea(), allShapes[i].getPerimeter());
            System.out.println(allShapes[i]);
        }


        System.out.println();
        Shape shapeWithMaxArea = findMaximumArea(allShapes);
        Shape shapeWithSecondMaxPerimeter = findSecondMaximumPerimeter(allShapes);

        System.out.format("\nМаксимальная площадь = %.3f -> %s\n", shapeWithMaxArea.getArea(), shapeWithMaxArea);
        System.out.format("Второй по максимуму периметр = %.3f -> %s\n\n", shapeWithSecondMaxPerimeter.getPerimeter(), shapeWithSecondMaxPerimeter);



        if(rectangle1.equals(rectangle2)){

            System.out.println(rectangle1 + " РАВЕН " + rectangle2);
        }
        else{

            System.out.println(rectangle1 + " НЕ РАВЕН " + rectangle2);
        }


        System.out.println();
        System.out.println("Все хэш-коды:");

        for(int i = 0; i < allShapes.length; i++){

            System.out.print(allShapes[i]);
            System.out.println(" -> " + allShapes[i].hashCode());
        }



/*
        System.out.printf("Максимальная площадь = %.2f ",  maxArea);
        System.out.println();

        int indexOfMaxArea = findIndexOfMaxArea(allShapes);
        System.out.println("Индекс фигуры:  " + indexOfMaxArea);
        System.out.print("Тип фигуры: ");
        if(allShapes[indexOfMaxArea] instanceof Circle){

            System.out.println("Круг");
        }
        if(allShapes[indexOfMaxArea] instanceof Triangle){

            System.out.println("Треугольник");
        }
        if(allShapes[indexOfMaxArea] instanceof Rectangle){

            System.out.println("Прямоугольник");
        }
        if(allShapes[indexOfMaxArea] instanceof Square){

            System.out.println("Квадрат");
        }

        */
    }

}
