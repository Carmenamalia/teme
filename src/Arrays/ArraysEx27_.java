package Arrays;

public class ArraysEx27_ {
/* Scrie un program care sa rearanjeze elementele pozitive și negative dintr-un array.
    Toate elementele negative trebuie sa mearga in stanga si toate elementele pozitive trebuie sa mearga in dreapta, pastrandu-si orindea initiala
     din array. De exemplu, pentru {-1, 2, -3, 4, 5, -6, 7, -8, 9}, array-ul va deveni: {-1 -3 -6 -8 5 2 7 4 9}
*/
    public static void main(String[] args) {
    int[] numbers = {-1, 2, -3, 4, 5, -6, 7, -8, 9};
    //o varianta: extragem negativele intr-un arr si pozitivele in alt arr si le concatenam
        //
//        int j = 0;
//        for (int i = 0;i<numbers.length;i++){
//
//            if (numbers[i]<0){
//                for (int j = i+1;j< numbers.length-1;j++) {
//                    if (numbers[j]<0) {
//                        int temp = numbers[j];
//                        numbers[j] = numbers[i];
//                        numbers[i] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 0;i< numbers.length;i++){
//            System.out.print(numbers[i] + " , ");
 //       }
    }

}
