import static java.lang.Math.sqrt;

public class Triangle extends figures{

    public int a;
    public int b;
    public int c;

    Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

        public double planeArea (int a, int b, int c) {
        double p = (double) (a + b + c) / 2;

        double planeArea = sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника равна " + planeArea);
        return planeArea;
    }
}

