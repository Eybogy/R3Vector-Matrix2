
public class Main {
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
