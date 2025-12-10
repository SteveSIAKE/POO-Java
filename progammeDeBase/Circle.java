public class Circle extends Shape {
    public static final double pi = 3.14159265358979;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetre() {
        return (2 * pi * radius);
    }

    @Override
    public double area() {
        return (pi * radius * radius);
    }

}
