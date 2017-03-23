package ru.academits.schepin.vector;

import java.util.Arrays;


public class Vector {
    private double[] vector;

    //Создание конструктора, где размерность вектора равна n :
    public Vector(int n) {
        setVector(new double[n]);
    }

    //Создание копии вектора, где передается только массив:
    public Vector(double[] v) {
        setVector(new double[v.length]);
        System.arraycopy(v, 0, getVector(), 0, v.length);
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }


    //Создание копии вектора, где передается размерность n и  массив:
    public Vector(int sizeOfVector, double[] v) {
        setVector(new double[sizeOfVector]);

        if (sizeOfVector <= v.length) {
            System.arraycopy(v, 0, getVector(), 0, sizeOfVector);
        } else {
            System.arraycopy(v, 0, getVector(), 0, v.length);
            for (int i = v.length; i < sizeOfVector; i++) {
                getVector()[i] = 0;
            }
        }
    }

    // Создание  копии вектора:
    public Vector(Vector v) {
        this(v.getVector());
    }

    // Получение размерности вектора:
    public int getSize() {
        return getVector().length;
    }


    @Override
    public String toString() {
        return Arrays.toString(getVector());
    }

    //todo Операции с векторами:

    //Метод для сложения векторов:
    public void sum(Vector b) {
        if (b.getVector().length >= getVector().length) {
            for (int i = 0; i < getVector().length; i++) {
                getVector()[i] += b.getVector()[i];
            }
        } else {
            for (int i = 0; i < b.getVector().length; i++) {
                getVector()[i] += b.getVector()[i];
            }
        }
    }

    //Сложение векторов:
    public static Vector sum(Vector a, Vector b) {
        Vector copyOfA = new Vector(a);  //Копия вектора а
        copyOfA.sum(b);

        return copyOfA;
    }

    //Метод для вычитания векторов:
    public void sub(Vector v) {

        int n = Math.min(v.getVector().length, getVector().length);

        for (int i = 0; i < n; i++) {
            getVector()[i] -= v.getVector()[i];
        }
    }


    // Вычитание векторов:
    public static Vector sub(Vector a, Vector b) {
        Vector result = new Vector(a);
        result.sub(b);
        return result;
    }

    // Умножение на скаляр:
    public Vector scale(double k) {
        Vector result = new Vector(this);
        for (int i = 0; i < result.getVector().length; i++) {
            result.getVector()[i] *= k;
        }
        return result;
    }

    //Разворот вектора:
    public Vector invert(int k) {
        Vector result = new Vector(this);
        for (int i = 0; i < result.getVector().length; i++) {
            result.getVector()[i] *= k;
        }
        return result;
    }

    // Получение длины вектора:
    public double norma() {
        double sum = 0;
        for (int i = 0; i < getVector().length; i++) {
            sum += getVector()[i] * getVector()[i];
        }
        return Math.sqrt(sum);
    }


    //Получение компоненты вектора по нидексу:
    public double getByIndex(int index) {
        return this.getVector()[index];
    }

    //Установка компоненты вектора по нидексу:
    public void setByIndex(int index, double value) {
        this.getVector()[index] = value;
    }

    //Скалярное произведение векторов:
    public static double scalarMultiply(Vector a, Vector b) {
        double result = 0;
        int n = Math.min(a.getSize(), b.getSize());

        for (int i = 0; i < n; i++) {
            result += a.getVector()[i] * b.getVector()[i];
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
        if (this.getVector().length != v.getVector().length) {
            return false;
        } else {
            for (int i = 0; i < this.getVector().length; i++) {
                if (this.getVector()[i] != v.getVector()[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getVector());
    }


}