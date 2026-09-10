public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle();
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Diagonal: " + rect.calculateDiagonal());
        rect.toString();
        System.out.println("Equal: " + rect.equals(rect2));

    }
}
