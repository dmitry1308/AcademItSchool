package ru.academits.schepin.vector;

import java.util.Arrays;
import java.util.jar.Pack200;

public class Vector {
    private int n;
    private double[] vector;

    // //Создание копии вектора, где передается только размерность n:
    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Вектор меньше 0");
        }
        vector = new double[n];
        for (int i = 0; i < n; i++) {
            vector[i] = 0;
        }

    }

    //Создание копии вектора, где передается только массив:
    public Vector(double[] v) {
        n = v.length;
        vector = new double[n];
        System.arraycopy(v, 0, vector, 0, n);
    }


    //Создание копии вектора, где передается размерность n и  массив:
    public Vector(int sizeOfVector, double[] v) {
        vector = new double[sizeOfVector];

        if (sizeOfVector <= v.length) {
            System.arraycopy(v, 0, vector, 0, sizeOfVector);
        } else {
            System.arraycopy(v, 0, vector, 0, v.length);
            for (int i = v.length; i < sizeOfVector; i++) {
                vector[i] = 0;
            }
        }
        n = sizeOfVector;
    }

    // Создание  копии вектора:
    public Vector(Vector v) {
        this(v.vector);
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
        n = this.vector.length;
    }


    // Получение размерности вектора:
    public int getSize() {
        return n;
    }


    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    //todo Операции с векторами:

    //Метод для сложения векторов:
    public void sum(Vector b) {
        if (b.vector.length >= n) {
            for (int i = 0; i < n; i++) {
                vector[i] += b.vector[i];
            }
        } else {
            for (int i = 0; i < b.n; i++) {
                vector[i] += b.vector[i];
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
        if (v.vector.length >= n) {
            for (int i = 0; i < n; i++) {
                vector[i] -= v.vector[i];
            }
        } else {
            for (int i = 0; i < v.n; i++) {
                vector[i] -= v.vector[i];
            }
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
        for (int i = 0; i < result.n; i++) {
            result.vector[i] *= k;
        }
        return result;
    }

    //Разворот вектора:
    public Vector invert() {
        Vector result = new Vector(this);
        for (int i = 0; i < result.n; i++) {
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
        if (a.getSize() <= b.getSize()) {
            for (int i = 0; i < a.getSize(); i++) {
                result += a.vector[i] * b.vector[i];
            }
        } else {
            for (int i = 0; i < b.getSize(); i++) {
                result += a.vector[i] * b.vector[i];
            }
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
        if (this.n != v.n) {
            return false;
        } else {
            for (int i = 0; i < this.n; i++) {
                if (this.vector[i] != v.vector[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += this.n % 117;
        for (int i = 0; i < this.n; i++) {
            hash += vector[i] % 11;
        }
        return hash;
    }
}