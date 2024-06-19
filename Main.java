import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,2,2);
        double tPlaneArea = triangle.planeArea(3, 2,2);

        Square square = new Square (2);
        int sPlaneArea = square.planeArea(2);

        Circle circle = new Circle(9);
        double cPlaneArea = circle.planeArea(9);

    }

    }