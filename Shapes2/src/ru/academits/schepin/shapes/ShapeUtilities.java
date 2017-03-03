package ru.academits.schepin.shapes;

public class ShapeUtilities {
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
        Shape[] newShapes = new Shape[allShapes.length];

        for (int i = 0; i < allShapes.length; i++) {
            newShapes[i] = allShapes[i];
        }

        for (int i = 0; i < newShapes.length - 1; i++) {
            int iom = i;
            for (int j = i + 1; j < newShapes.length; j++) {
                if (newShapes[j].getPerimeter() > newShapes[iom].getPerimeter()) {
                    iom = j;
                }
            }

            if (iom != i) {
                Shape temp = newShapes[i];
                newShapes[i] = newShapes[iom];
                newShapes[iom] = temp;
            }
        }
        return newShapes[1];
    }
}
