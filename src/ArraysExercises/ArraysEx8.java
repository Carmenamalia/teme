package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

/* Vrei sa vezi cat studiezi saptamanal pentru programare
Citeste de la tastatura numarul de zile pe care le-ai petrecut invatand programare.
Citeste apoi cate ore ai invatat in fiecare din aceste zile.
Calculeaza media de studiu pe zi.
 */
public class ArraysEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStudy = 5;
        int[] hoursStudyPerDay = {2, 3, 2, 3, 2};
        System.out.println(Arrays.toString(hoursStudyPerDay));
        int totalHoursStudy = 0;

        for (int i = 0; i < hoursStudyPerDay.length; i++) {

            totalHoursStudy = totalHoursStudy + hoursStudyPerDay[i];

        }
        System.out.println("ore totale : " + totalHoursStudy);
        int medStudyPerDay = totalHoursStudy / daysStudy;
        System.out.println("media de studiu pe zi este; " + medStudyPerDay);
    }
}

