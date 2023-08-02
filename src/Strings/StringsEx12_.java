package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringsEx12_ {
    public static void main(String[] args) {
/* Scrie un program prin care utilizatorul sa introduca de la tastatura hobby-uri ca String-uri, pana cand introduce cuvantul “stop” sau “exit”.
Utilizatorul poate introduce maxim 10 hobby-uri. Fiecare hobby este adaugat intr-un array de String-uri.
La sfarsit, cand utilizatorul a introdus “stop” sau “exit”, se vor afisa in consola toate hobby-urile din array.
 */
        Scanner scanner = new Scanner(System.in);
        String[] hobby = new String[5];
      for (int i = 0;i< hobby.length;i++){

          hobby[i] = scanner.nextLine();

          if (hobby[i].equals("stop")||hobby[i].equals("exit")){
              System.out.println(Arrays.toString(hobby));
          }
      }
    }
}
