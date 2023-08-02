package Arrays;

/* Scrie un program care sa evalueze automat raspunsurile date de un student la un quiz.
Ca si input (pe care il poti hardcoda initial) vei avea raspunsurile corecte si raspunsurile date de
student. /De exemplu, pentru:

studentAnswers : {"C", "D", "D", "B", "A", "C", "B"}
teachersAnswers : {"A", "D", "D", "B", "B", "C", "B"}
functia va returna 5, deoarece sunt 5 raspunsuri care corespund, la indecsii 1,2,3,5,6.

 */
public class ArraysEx15 {
    public static void main(String[] args) {
       String[] studentAnswers = {"C", "D", "D", "B", "A", "C", "B"};
       String[] teachersAnswers = {"A", "D", "D", "B", "B", "C", "B"};

       int numberOfCorrectAnswers = 0;

       //mergem prin fiecare pozitie din array
        //la fiecare pas comparam elem de la fiecare pozitie din primul array cu elem din al doilea
        //dc sunt = ,numaram inca un raspuns corect
        for(int i = 0;i<studentAnswers.length;i++){
            if(studentAnswers[i].equals(teachersAnswers[i])){
                numberOfCorrectAnswers++;
            }
        }
        System.out.println("correct answers: " + numberOfCorrectAnswers);
    }
}
