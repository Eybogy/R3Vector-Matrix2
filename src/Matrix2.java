/* Реализуйте класс Matrix2, позволяющий выполнять над квадратными матрицами порядка два следующие операции: сложение,
вычитание, умножение на число, перемножение, вычисление определителя и обратной матрицы.  */


public class Matrix2 {
    private int a11, a12, a21, a22;

    public Matrix2( int a11, int a12, int a21, int a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;

    }

    public Matrix2() throws Exception {
        a11 = Xterm.inputInt("a11 -> ");
        a12 = Xterm.inputInt("a12 -> ");
        a21 = Xterm.inputInt("a21 -> ");
        a22 = Xterm.inputInt("a22 -> ");
    }

    public static Matrix2 plus(Matrix2 A, Matrix2 B) {   // сложение
        return new Matrix2(A.a11 + B.a11, A.a12 + B.a12,A.a21 + B.a21, A.a22 + B.a22);
    }

    public static Matrix2 minus(Matrix2 A, Matrix2 B) {  // вычитание
        return new Matrix2(A.a11 - B.a11, A.a12 - B.a12,A.a21 - B.a21, A.a22 - B.a22);
    }

    public static Matrix2 mult(Matrix2 A, int k) {     // умножение на число
        return new Matrix2(k * A.a11, k * A.a12,k * A.a21, k * A.a22);
    }

    public static Matrix2 product(Matrix2 A, Matrix2 B) {  // перемножение
        // при перемножении элемент с(i,j) = (i строка матрицы А) * (j столбец матрицы В)
        return new Matrix2(A.a11 * B.a11 + A.a12 * B.a21, A.a11 * B.a12 + A.a12 * B.a22,A.a21 * B.a11 + A.a22 * B.a21, A.a21 * B.a12 + A.a22 * B.a22);
    }

    public static int determinant(Matrix2 A) {  // вычисление определителя
        // вычисление по формуле a11 * a22 - a12 * a21
        return  A.a11 * A.a22 - A.a12 * A.a21;
    }

    public static Matrix2 InverseMatrix(Matrix2 A) {  // Обратная матрица
        int det = A.a11 * A.a22 - A.a12 * A.a21;
        // Проверка на то что Определитель не равен нулю.
        if (det == 0) {
            System.out.println("Определитель равен нулю, обратной матрицы нет");
            return A;
        } else {
            // Вместо создания присоед. матрицы С, заменяя элементы матрицы на их минор, заменим только элементы a12 b a21, так как работаем только с матрицой 2х2
            A.a12 = -A.a12;
            A.a21 = -A.a21;
            // Вычисляем Обратнуую матрицу по формуле ( 1/(det A) ) * C
            return new Matrix2(1 / det * A.a11, 1 / det * A.a12, 1 / det * A.a21, 1 / det * A.a22);
        }
    }

    public static void main(String[] args) throws Exception {
        Matrix2 M1 = new Matrix2();
        Matrix2 M2 = new Matrix2();
        Matrix2.InverseMatrix(M1);
    }
}
