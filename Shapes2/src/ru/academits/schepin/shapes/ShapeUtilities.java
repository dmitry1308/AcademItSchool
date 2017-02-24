package ru.academits.schepin.shapes;

public class ShapeUtilities {

    public static String getNameOfShape(Shape obj){

        if(obj instanceof Circle){

            return  "Круг";
        }
        if(obj instanceof Triangle){

            return  "Треугольник";
        }
        if(obj instanceof Rectangle){

            return "Прямоугольник";
        }
        if(obj instanceof Square){

            return "Квадрат";
        }

        return  "Неизвестно";
    }

    public static Shape findMaximumArea(Shape[] allShapes) {

        Shape bestShape = allShapes[0];


        for (int i = 1; i < allShapes.length; ++i) {


            if (bestShape.getArea() < allShapes[i].getArea()) {
                bestShape = allShapes[i];
            }
        }
        return bestShape;
    }

    public static Shape findSecondMaximumPerimeter(Shape[] allShapes) {


        Shape max = allShapes[0];
        Shape max2 = null;

        for (int i = 1; i < allShapes.length; ++i) {

            if(max.getPerimeter() < allShapes[i].getPerimeter()){

                max2 = max;
                max = allShapes[i];
            }
        }
        return max2;
    }

    /*public static Shape[] sortByArea(Shape[] allShapes) {

        Shape[] newShapes = new Shape[allShapes.length];

        for(int i = 0; i < allShapes.length; i++){

            newShapes[i] = allShapes[i];
        }

        for(int i = 0; i < newShapes.length-1; i++){

            int iom = i;

            for(int j = i+1; j < newShapes.length; j++){

                if(newShapes[j].getArea()>newShapes[iom].getArea()){

                    iom = j;
                }
            }

            if(iom!=i){

                Shape temp = newShapes[i];
                newShapes[i] = newShapes[iom];
                newShapes[iom] = temp;
            }
        }

        return newShapes;
    }*/


}
