package ru.academits.schepin.rangeDifficult;


public class Main1 {

    public static void main(String[] args) {


        Range1[] allRanges = new Range1[6];

        allRanges[0] = new Range1(-20, 15);
        allRanges[1] = new Range1(-40, 100);
        allRanges[2] = new Range1(20, 40);
        allRanges[3] = new Range1(0, 28);
        allRanges[4] = new Range1(-50, -5);
        allRanges[5] = new Range1(-10, 5);

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                allRanges[i].print();
                System.out.print(" INTERSECTION ");
                allRanges[j].print();
                System.out.print(" = ");
                Range1 result = Range1.intersection(allRanges[i], allRanges[j]);
                if (result == null) {

                    System.out.print("Пересечения нет");
                } else {

                    result.print();
                }
                System.out.println();
            }
        }

        System.out.println("********************************************");


        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                allRanges[i].print();
                System.out.print(" UNION ");
                allRanges[j].print();
                System.out.print(" = ");
                Range1[] result = Range1.union(allRanges[i], allRanges[j]);
                if (result == null) {

                    System.out.print("Пересечения нет");
                } else {

                    for (int k = 0; k < result.length; k++) {

                        result[k].print();
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("********************************************");


        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                allRanges[i].print();
                System.out.print(" SUBTRACT ");
                allRanges[j].print();
                System.out.print(" = ");
                Range1[] result = Range1.subtract(allRanges[i], allRanges[j]);
                if (result == null) {

                    System.out.print("Пересечения нет");
                } else {

                    for (int k = 0; k < result.length; k++) {

                        result[k].print();
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
