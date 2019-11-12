/* Задача 1.6. Реализуйте класс R3Vector, позволяющий выполнять над
векторами в пространстве следующие операции: сложение, вычитание,
умножение на число, вычисление скалярного, векторного и смешанного произведений */

import java.io.IOException;

public class R3Vector {
    private double x, y, z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public R3Vector() throws Exception {
        x = Xterm.inputDouble("x -> ");
        y = Xterm.inputDouble("y -> ");
        z = Xterm.inputDouble("z -> ");
    }

    public static R3Vector plus(R3Vector a, R3Vector b, R3Vector c) {   // сложение
        System.out.println(a.x + b.x);
        System.out.println(a.y + b.y);
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static R3Vector minus(R3Vector a, R3Vector b, R3Vector c) {  // вычитание
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static R3Vector mult(R3Vector a, double k) {     // умножение на число
        return new R3Vector(k * a.x, k * a.y, k* a.z);
    }

    public static double product(R3Vector a, R3Vector b, R3Vector c) {  // скалярное произведение - абстрактное число; двухмерное пространство
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static double vectors(R3Vector a, R3Vector b, R3Vector c) {  // векторное произведение - это вектор, а не абстрактнное число; трёхмерное пространство
        return a.x * b.x + a.y * b.y;
    }



    static int n = 3;


    static int dotProduct(int vect_A[], int vect_B[])  {       // Функция, которая возвращает точечное произведение двух векторных массивов
        int product = 0;
        // Loop for calculate cot product
        for (int i = 0; i < n; i++)
            product = product + vect_A[i] * vect_B[i];
        return product;
    }

    // Function to find
    // cross product of two vector array.
    static void crossProduct(int vect_A[], int vect_B[], int cross_P[]) {
        cross_P[0] = vect_A[1] * vect_B[2] - vect_A[2] * vect_B[1];
        cross_P[1] = vect_A[0] * vect_B[2] - vect_A[2] * vect_B[0];
        cross_P[2] = vect_A[0] * vect_B[1] - vect_A[1] * vect_B[0];
    }


    // Driver code
    public static void main (String[] args)
    {
        int vect_A[] = { 3, -5, 4 };
        int vect_B[] = { 2, 6, 5 };
        int cross_P[] = new int [n];

        // dotProduct function call
        System.out.print ( "Dot product:");
        System.out.println (dotProduct(vect_A, vect_B)) ;

        // crossProduct function call
        System.out.print ( "Cross product:");
        crossProduct(vect_A, vect_B, cross_P);

        // Loop that print
        // cross product of two vector array.
        for (int i = 0; i < n; i++)

            System.out.print ( cross_P[i] +" ");

    }
/*
    public static void main(String[] args) throws Exception {
        // R3Vector V = new R3Vector();
        R3Vector V1 = new R3Vector();
        R3Vector V2 = new R3Vector();
        plus(V1, V2);
    }

 */
}
