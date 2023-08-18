package OOP.ex1geometricshape;

public class Canvas_main {
    public static void main(String[] args) {
//Construiește o aplicație care să modeleze în cod forme geometrice și operațiile cu ele
        //În  metoda main se va testa calculul ariei atât pentru cercuri cât și pentru dreptunghiuri

        Circle circle = new Circle(10);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(12.5, 4);
        System.out.println(rectangle);
        System.out.println("aria cercului e: " + circle.computeArea());
        System.out.println("aria dreptunghiului e: " + rectangle.computeArea());
    }
}
