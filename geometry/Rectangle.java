package geometry;

public class Rectangle {
    private double length; // The length of the rectangle
    private double width; // The width of the rectangle

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}