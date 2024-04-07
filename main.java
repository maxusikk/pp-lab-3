public class main {
    public static void main(String[] args) {
        Point point = new Point(1.5, 2.5);

        point.setX(3.5);
        point.setY(4.5);

        System.out.println("Współrzędne: (" + point.getX() + ", " + point.getY() + ")");
    }
}