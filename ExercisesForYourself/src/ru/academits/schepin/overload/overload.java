package ru.academits.schepin.overload;


public class overload {
    public static double sum(double a, double b){
        return a+b;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String [] args){
        System.out.println( sum(3,4));
    }
}


