package SDA1;

public class SDA1_Ex5 {
/* Scrie un program care sa inverseze cuvintele dintr-un String.
De exemplu, pentru "programarea este usoara", se va afisa "usoara este programarea".
 */
    public static void main(String[] args) {
        String s = "programarea este usoara";
        String[] words = s.split(" ");
        String sReverse = "";
        for (int i = words.length-1;i>=0;i--){
            sReverse+=words[i] + " ";
        }
        System.out.println(sReverse);
    }
}
