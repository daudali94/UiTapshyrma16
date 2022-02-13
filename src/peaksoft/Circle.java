package peaksoft;
public class Circle {
    public static final double pi = 3.1415926535;
    private  double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void area (){
        double i = pi*(radius*radius);
        System.out.println("Плошадь area "+i);
    }
    public void circumference(){
        double i = (pi*2*radius);
        System.out.println("Длина radius "+i);
    }
}
