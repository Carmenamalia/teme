package OOP.ex1geometricshape;

public class Circle implements Shape {
    double radius; // (raza cercului)

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public  double computeArea() {
        double pi = Math.PI;
        return this.radius * this.radius * pi;
    }
}
