package ru.academits.schepin.exercisesForThirdLecture;

public class Main {
    public static void main(String[] args) {

        //Операции с обертками:
        //1
        Integer x = new Integer(3); //объявление обертки
        Integer y = 2;              //объявление обертки(способ второй)
        int z = x + y;
        System.out.println(z);
        System.out.println("**********************************");

        //2
        //Получение значения из строки

        String s = "3";
        Integer a = new Integer(s);
        System.out.println(a);

        //
        //Преобраз типов

        double f= y.doubleValue();
        System.out.println(f);

    }

}
