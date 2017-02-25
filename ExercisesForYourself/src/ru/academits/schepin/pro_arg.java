package ru.academits.schepin;


public class pro_arg {
    public static double average(double... numbers) {
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total/numbers.length;
    }

    public static void main (String [] args){
        System.out.println(average(2,4,8,6));
        System.out.println(average(new double[] {2,5,6,3}));
    }
}
