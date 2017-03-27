package ru.academits.schepin.vector;

import java.util.Arrays;


public class Vector {
    private double[] vector;

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    //Создание конструктора, где размерность вектора равна n :
    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Неправильная размерность вектора");
        }
        vector = (new double[n]);
    }

    // Создание  копии вектора:
    public Vector(Vector v) {
        this(v.vector);
    }


    //Создание копии вектора, где передается размерность n и  массив:
    public Vector(int sizeOfVector, double[] v) {
        if (sizeOfVector <= 0) {
            throw new IllegalArgumentException("Неправильная размерность вектора");
        }

        vector = new double[sizeOfVector];
        if (sizeOfVector < v.length) {
            System.arraycopy(v, 0, vector, 0, sizeOfVector);
        } else {
            System.arraycopy(v, 0, vector, 0, v.length);
        }
    }


    // Получение размерности вектора:
    public int getSize() {
        return vector.length;
    }


    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    //todo Операции с векторами:

    //Метод для сложения векторов:
    public void sum(Vector b) {
        for (int i = 0; i < b.getSize(); i++) {
            vector[i] += b.vector[i];
        }
    }


    //Сложение векторов:
    public static Vector sum(Vector a, Vector b) {
        int n = Math.max(a.getSize(), b.getSize());

        double[] array = new double[n];
        System.arraycopy(a.getVector(), 0, array, 0, a.getSize());
        Vector result = new Vector(array);

        result.sum(b);

        return result;
    }


    //Метод для вычитания векторов:
    public void sub(Vector b) {
        for (int i = 0; i < b.getSize(); i++) {
            vector[i] -= b.vector[i];
        }
    }

    // Вычитание векторов:
    public static Vector sub(Vector a, Vector b) {
        int n = Math.max(a.getSize(), b.getSize());
        double[] array = new double[n];
        System.arraycopy(a.getVector(), 0, array, 0, a.getSize());
        Vector result = new Vector(array);
        result.sub(b);
        return result;
    }

    // Умножение на скаляр:
    public Vector scale(double k) {
        Vector result = new Vector(this);
        for (int i = 0; i < result.vector.length; i++) {
            result.vector[i] *= k;
        }
        return result;
    }

    //Разворот вектора:
    public Vector invert() {
        Vector result = new Vector(this);
        for (int i = 0; i < result.vector.length; i++) {
            result.vector[i] *= -1;
        }
        return result;
    }

    // Получение длины вектора:
    public double norma() {
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i] * vector[i];
        }
        return Math.sqrt(sum);
    }


    //Получение компоненты вектора по нидексу:
    public double getByIndex(int index) {
        return this.vector[index];
    }

    //Установка компоненты вектора по нидексу:
    public void setByIndex(int index, double value) {
        this.vector[index] = value;
    }

    //Скалярное произведение векторов:
    public static double scalarMultiply(Vector a, Vector b) {
        double result = 0;
        int n = Math.min(a.getSize(), b.getSize());

        for (int i = 0; i < n; i++) {
            result += a.vector[i] * b.vector[i];
        }

        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (o.getClass() != this.getClass())) {
            return false;
        }

        Vector v = (Vector) o;
        if (this.vector.length != v.vector.length) {
            return false;
        } else {
            for (int i = 0; i < this.vector.length; i++) {
                if (this.vector[i] != v.vector[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vector);
    }


}