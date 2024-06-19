import static java.lang.Math.sqrt;

public class Square extends figures{
    public int x;
    Square (int x){
        this.x = x;
    };

    public int planeArea (int x) {
        int planeArea = x * x;
        System.out.println("Площадь квадрата равна " + planeArea);
        return planeArea;
    };
}
