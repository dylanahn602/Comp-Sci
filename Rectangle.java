public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 8;
        width = 6;
    }

    public Rectangle(int newLength, int newWidth) {
        width = newWidth;
        length = newLength;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int newLength) {
        length = newLength;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public int calculateArea() {
        return length * width;
    }
    public int calculatePerimeter() {
        return (length + width) * 2;
    }
    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
    public String toString() {
        return ("The length of this rectangle is " + length + " and the width is " + width);
    }
    public boolean equals(Rectangle other) {
        return (length == other.getLength() && width == other.getWidth());
    }
}
