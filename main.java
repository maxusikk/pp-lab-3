import geometry.Point;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);

        // Create a ColoredCircle object with the center point, radius, and color
        ColoredCircle coloredCircle = new ColoredCircle(center, 5, "Red");

        // Display the properties of the colored circle
        System.out.println("Colored Center: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Colored Radius: " + coloredCircle.getRadius());
        System.out.println("Colored Perimeter: " + coloredCircle.calculatePerimeter());
        System.out.println("Colored Area: " + coloredCircle.getArea());
        System.out.println("Colored Color: " + coloredCircle.getColor());
    }
}
