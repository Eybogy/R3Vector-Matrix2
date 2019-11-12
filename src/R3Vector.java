/* Задача 1.6. Реализуйте класс R3Vector, позволяющий выполнять над
векторами в пространстве следующие операции: сложение, вычитание,
умножение на число, вычисление скалярного, векторного и смешанного произведений */

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

    public static R3Vector plus(R3Vector a, R3Vector b) {   // сложение
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static R3Vector minus(R3Vector a, R3Vector b) {  // вычитание
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static R3Vector mult(R3Vector a, double k) {     // умножение на число
        return new R3Vector(k * a.x, k * a.y, k* a.z);
    }

    public static double product(R3Vector a, R3Vector b) {  // скалярное произведение - абстрактное число
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static R3Vector vectors(R3Vector a, R3Vector b) {  // векторное произведение - это вектор, а не абстрактнное число; трёхмерное пространство
        return new R3Vector( a.y + b.z - b.y - a.z, a.x + b.z - b.x - a.z, a.x + b.y - b.x - a.y);
    }

    public static double mixed(R3Vector a, R3Vector b, R3Vector c) {  // смешанное произведение - абстрактное число; Равно = векторное произведение * скалярное произведение
        // необходимо вычислить определитель из всех координат векторов, вычисляю через матрицу 3х3
        return (a.x * b.y * c.z) + (c.x * a.y * b.z) + (b.x * c.y * a.z) - (c.x * b.y * a.z) - (b.x * a.y * c.z) - (a.x * c.y * b.z);
    }




    public static void main(String[] args) throws Exception {
        R3Vector V1 = new R3Vector();
        R3Vector V2 = new R3Vector();
        R3Vector.plus(V1, V2);
        R3Vector.minus(V1, V2);
        R3Vector.mult(V1, 5);
        R3Vector.product(V1, V2);
        R3Vector.vectors(V1, V2);
        R3Vector V3 = new R3Vector();
        R3Vector.mixed(V1, V2, V3);
    }
}
