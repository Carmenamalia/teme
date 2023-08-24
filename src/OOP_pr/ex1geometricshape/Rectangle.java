package OOP_pr.ex1geometricshape;

public class Rectangle implements Shape{
    double height; //(lungime)
    double width; // (lățime)

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public double computeArea() {
        return (this.height * this.width);
    }
}
