package SDA1;

public class SDA1_Ex7 {
    /* Scrie un program care sa construiasca o lista cu toate substring-urile unui String.
   De exemplu, pentru String-ul "baca", lista de substring-uri este ["b","ba","bac","baca","a","ac","aca","c","ca"]
     */
    public static void main(String[] args) {
        String s = "baca";
       // s = s.substring(1, 4);
        System.out.println("stringul original:  " + s);
        String[] substrings = new String[100];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1;j<=s.length();j++) {
               // String currentSubstring = s.substring(i, j);
             //     if(!contains(substrings,currentSubstring){
                substrings[k] = s.substring(i,j);
                k++;
            //}
                System.out.println(substrings[k]);
            }
        }

    }
}
