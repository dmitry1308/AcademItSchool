package ru.academits.schepin.vector;


public class Main {
    public static void main(String[] args) {
        //Сумма:
        double[] array1 = {1, 6, 3, 9, 7, 2};
        double[] array2 = {6, 8, 9, 8};

        Vector a = new Vector(6, array1);
        Vector b = new Vector(array2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Создать копию вектора:
        Vector copyOfA = new Vector(a);
        System.out.println("Копия вектора а: " + copyOfA);

        System.out.println("Размер вектора a= " + a.getSize());
        System.out.println("Размер вектора b= " + b.getSize());


        System.out.println("Прибавление вектора:");
        Vector c = Vector.sum(a, b);
        System.out.println("c = a + b");
        System.out.println("c = " + c);


        System.out.println("Вычитание вектора:");
        double[] array3 = {3, 4, 5};
        Vector d = new Vector(10, array3);
        Vector e = Vector.sub(d, c);
        System.out.println("d = " + d);
        System.out.println("d - c = " + e);


        System.out.println("Умножение векторар на скаляр:");
        double[] array4 = {4, 8, 7, 9, 6, 1};
        Vector m = new Vector(array4);
        System.out.println("m = " + m);
        System.out.println("m * 2 = " + m.scale(2));


        System.out.println("Разворот вектора:");
        System.out.println("-c = " + c.invert(-1));

        System.out.println("Получение длины вектора:");
        System.out.println("|a| = " + a.norma());

        System.out.println("Получение и установка длины вектора по индексу: ");
        System.out.println("a= " + a);
        System.out.println("c= " + c);
        System.out.println("Замена 2-го индекса вектора с на 0-ой индекс вектора а");
        c.setByIndex(2, a.getByIndex(0));
        System.out.println("c = " + c);


        System.out.println("Скалярное произведение векторов:");
        double scalarP = Vector.scalarMultiply(c, d);
        System.out.println("c*d = " + scalarP);


        System.out.println("Сравнение векторов с и f:");
        double arr5[] = {7, 14, 1, 17, 7, 2};
        Vector f = new Vector(arr5);
        System.out.println(c + " и " + f);
        if (c.equals(f)) {
            System.out.println("c равен f");
        } else {
            System.out.println("c не равен f");
        }

        System.out.println("Хэш коды: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("hash(a) = " + a.hashCode());
        System.out.println("hash(b) = " + b.hashCode());
        System.out.println("hash(c) = " + c.hashCode());
    }
}
