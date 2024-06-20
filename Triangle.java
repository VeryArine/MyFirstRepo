import static java.lang.Math.sqrt;

public class Triangle extends Figures{

    public int a;
    public int b;
    public int c;

    Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double planeArea () {

    double p = (double) (this.a + this.b + this.c) / 2;

    super.planeArea = sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));

    return planeArea;

    };

    @Override
    public void printArea () {
        System.out.println("Площадь треугольника равна " + planeArea);
    };

}

