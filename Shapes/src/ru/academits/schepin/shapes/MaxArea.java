package ru.academits.schepin.shapes;


public class MaxArea {
    public static double findMaximumArea(Shape[] allShapes) {
        double max = 0;
        for (int i = 0; i < allShapes.length; ++i) {
            if (max < allShapes[i].getArea()) {
                max = allShapes[i].getArea();
            }
        }
        return max;
    }


    public static int findIndexOfMaxArea(Shape[] allShapes) {
        int indexOfMaxArea = 0;
        int i;

        for (i = 0; i < allShapes.length; ++i) {
            if ( allShapes[indexOfMaxArea].getArea() < allShapes[i].getArea()) {
                indexOfMaxArea =i;
            }
        }

        return indexOfMaxArea;
    }


}


