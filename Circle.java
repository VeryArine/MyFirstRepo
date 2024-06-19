public class Circle extends figures{

    public int r;

    Circle (int r){
        this.r = r;
    };
    public double planeArea (int r) {
        double planeArea = r * r * 3.14;
        System.out.println("Площадь круга равна " + planeArea);
        return planeArea;
    };
}
