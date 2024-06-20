public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,2,2);
        double tPlaneArea = triangle.planeArea();
        triangle.printArea();

        Square square = new Square (2);
        double sPlaneArea = square.planeArea();
        square.printArea();


        Circle circle = new Circle(1);
        double cPlaneArea = circle.planeArea();
        circle.printArea();

    }

    }