package Methods;

import java.util.Scanner;

/* Defineste o metoda cu numele "createNotification", care sa accepte ca si parametri mesajul notificarii
, cine a trimis notificarea, si cine va primi notificare. Metoda ar trebui sa returneze textul notificarii.

Defineste o metoda cu numele sendNotificationText, care sa accepte ca si parametri mesajul notificarii,
 cine a trimis notificarea, si cine va primi notificare. Metoda ar trebui sa creeze notificarea
 in functie de parametri, apoi sa afiseze la consola: "notificarea a fost trimisa prin mesaj",
  urmat de textul notificarii.

Defineste o metoda cu numele sendNotificationEmail, care sa accepte ca si parametri mesajul notificarii,
 cine a trimis notificarea, si cine va primi notificare. Metoda ar trebui sa creeze notificarea
  in functie de parametri, apoi sa afiseze la consola: "notificarea a fost trimisa prin e-mail",
  urmat de textul notificarii.

Apeleaza apoi metodele sendNotificationText si sendNotificationEmail din metoda main.
Atunci cand le apelezi, paseaza-le ca parametri niste valori citite de la tastatura
 (mesajele notificarilor, cine le primeste si cine le trimite).

 */
public class Methods_Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sender = scanner.nextLine();
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();
        String notification = createNotification(sender, message, recipient);
        sendNotificationText(notification);
        sendNotificationEmail(notification);
    }

    public static String createNotification(String sender, String message, String recipient) {
        String notification = "Expeditorul: " + sender + "a trimis mesajul: " + message + "catre: " + recipient;
        return notification;
    }
    public static void sendNotificationText(String notification) {
        System.out.println("notificarea a fost trimisa prin mesaj:\n " + notification);
    }
    public static void sendNotificationEmail(String notification) {
        System.out.println("notificarea a fost trimisa prin email:\n " + notification);
    }


}
