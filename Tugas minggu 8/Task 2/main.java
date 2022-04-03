package inheritanceabstractclassinterface.Tugas2;

/**
 *
 * @author Maolana
 */

public class main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("red", false);
        System.out.println(s2.toString());
        Circle c1 = new Circle(7.0, "red", false);
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        Square sq1 = new Square(1.0);
        System.out.println(sq1.toString());
    }
}
