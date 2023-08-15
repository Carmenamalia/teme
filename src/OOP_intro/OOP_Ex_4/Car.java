package OOP_intro.OOP_Ex_4;

public class Car {
    /* atribute:

     *numar de roti
     *viteza maxima
     *brand
     *culoare
     *viteza curenta
     *treapta curenta de viteza
     */
    static final int NUMBER_OF_WHEELS = 4;
    final int maxSpeed;
    String brand;
    String color;
    int currentSpeed;
    int currentGear;

    /* functionalitati:

     *porneste masina (treapta de viteza devine 1 si viteza curenta devine 1)
     *accelereaza (mareste viteza curenta cu o anumita valoare, iar daca se accelereaza cu mai mult de 20 km/ora, treapta de viteza se mareste automat)
     *decelereaza (scade viteza curenta cu o anumita valoare, iar daca se decelereaza cu mai mult de 20 km/ora, treapta de viteza se scade automat)
     *mareste treapta de viteza
     *scade treapta de viteza
     *converteste o anumita valoare a vitezei din km/ora in mile/ora
     */
    public Car(int maxSpeed, String brand, String color) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.color = color;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public void startCar() {
        this.currentGear = 1;
        this.currentSpeed = 1;
    }

    public void accelerate(int speed) {
        if (speed > 20) {
            upGear();
        }
        if (this.currentSpeed + speed <= this.maxSpeed) {
            this.currentSpeed += speed;
        } else {
            System.out.println("ai depasit viteza maxima");
        }

    }

    public void upGear() {
        this.currentGear++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                '}';
    }

    public void deccelerate(int speed) {
        if (speed > 20) {
            downGear();
        }
        if (this.currentSpeed - speed > 0) {
            this.currentSpeed -= speed;
        }
    }
        public void downGear () {
            this.currentGear--;
        }


        public static double convertToMpH ( int speed){
            //aplic formula din km/h pe mile
            return 0;
        }

    }
