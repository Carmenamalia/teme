package Methods;

import java.util.Scanner;


public class Methods_Ex9 {
    /* Creeaza o aplicatie pentru un smart home
   Aplicatia va fi folosita pentru a controla remote difuzoarele wireless, luminile, securitatea casei, incuietorile usilor si diversi roboti care se afla in casa.
   Pentru inceput, vrem sa putem face urmatoarele actiuni:

   pornim sau oprim muzica
   pornim sau oprim lumina
   incuiem sau descuiem usa
     */
    public static void main(String[] args) {
 /* Algoritmul cu care am putea descrie un program pentru este urmatorul:

1. cere parola utilizatorului
2. verifica daca este corecta
3. intreba utilizatorul ce actiune vrea sa faca
4. citeste actiunea si daca este suportata, execut-o
Sa zicem ca avem deja codul aplicatiei (scheletul), doar ca am folosit o singura metoda:
  */

        accesSmartHome();

    }

    public static void accesSmartHome() {
        //citirea parolei
        //verificarea parolei
        //daca e corecta apelam metoda choseAction();
        int password = 76543210;
        int passwordInput;
        Scanner scanner = new Scanner(System.in);
//verific daca parola e corecta
        //atat timp cat parola e incorecta cer introducerea parolei
        do {
            System.out.println("Enter password: ");
            passwordInput = scanner.nextInt();
        } while (passwordInput != password);
      //daca parola e corecta trece la alegerea optiunii
        choseOption();
    }

    public static void choseOption() {
        Scanner scanner = new Scanner(System.in);
        //in functie de actiune sa execute :
        //pentru 1 :controlSpeakers();
        //pentru 2 : controlLights();
        //pentru 3 : controlDoor();
        //pentru 4 : controlRobot();
        // asking the user what they want to do:

        System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door, 4 - robot");
        String action = scanner.next();

        switch (action) {
            case "1":
                // asking the user about speakers
                controlSpeakers();
                break;
            case "2":
                // asking the user about lights...
                controlLights();
                break;
            case "3":
                // asking the user about the door...
                controlDoor();
                break;
            case "4":
                // asking the user about the robot...
                controlRobot();
            default:
                System.out.println("Invalid option");
        }
    }

    public static void controlSpeakers() {
        Scanner scanner = new Scanner(System.in);
        String speakersState;
        System.out.println("Vrei sa opresti muzica?Alege off ; Vrei sa pornesti muzica?Alege on ");
        String speakersState1 = scanner.nextLine();
        switch (speakersState1) {
            case "on":
                speakersState = speakersState1;
                System.out.println("The lights are " + speakersState);
            case "off":
                speakersState = speakersState1;
                System.out.println("The lights are  " + speakersState);
            default:
                System.out.println("Invalid option");

        }
    }

    public static void controlLights() {
        Scanner scanner = new Scanner(System.in);
        String lampState;
        System.out.println("vrei sa aprinzi lumina?Alege on; Vrei sa stingi lumina?alege off");
        String lightsState1 = scanner.nextLine();
        switch (lightsState1) {
            case "on":
                lightsState1 = "ON";
                lampState = lightsState1;
                System.out.println("The lights are " + lampState);
            case "off":
                lightsState1 = "OFF";
                lampState = lightsState1;
                System.out.println("The lights are " + lampState);
            default:
                System.out.println("Invalid option");
        }
    }

    public static void controlDoor() {
        Scanner scanner = new Scanner(System.in);
        String doorState;
        System.out.println("Vrei sa deschizi usa?introdu open;Vrei sa inchizi usa?introdu close");
        String doorState1 = scanner.nextLine();
        switch (doorState1) {
            case "open":
                doorState1 = "open";
                doorState = doorState1;
                System.out.println("The door is " + doorState);
            case "close":
                doorState1 = "close";
                doorState = doorState1;
                System.out.println("The door is " + doorState);
            default:
                System.out.println("Invalid option");
        }
    }

    public static void controlRobot() {
        Scanner scanner = new Scanner(System.in);
        String robotState;
        System.out.println("Vrei sa pornesti robotul?introdu on;Vrei sa il opresti?introdu off");
        String robotState1 = scanner.nextLine();
        switch (robotState1) {
            case "open":
                robotState1 = "on";
                robotState = robotState1;
                System.out.println("The door is " + robotState);
            case "close":
                robotState1 = "off";
                robotState = robotState1;
                System.out.println("The door is " + robotState);
            default:
                System.out.println("Invalid option");
        }
    }
}