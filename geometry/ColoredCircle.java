package geometry;

public class ColoredCircle extends geometry.Circle {
    private String color; // Private field for the color

    // Constructor that initializes the center, radius, and color
    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius); // Call the constructor of the superclass Circle
        this.color = color; // Set the color of the circle
    }

    // Public method to get the color of the circle
    public String getColor() {
        return color;
    }
}