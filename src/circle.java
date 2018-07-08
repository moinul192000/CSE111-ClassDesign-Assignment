/**
 * Created By Dark Sh@dow
 */
public class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
