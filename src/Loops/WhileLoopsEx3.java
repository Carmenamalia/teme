public class WhileLoopsEx3 {
    public static void main(String[] args) {
        //Scrie un program care afiseaza numerele pare de la 1 la n.
        //numerele pare de la 1 la n
        //trec prin fiecare nr de la 1 la n
        //verrific daca nr curent(i) este par
        //daca da il afisez
        int n = 10;
        int i = 1;
        while(i <= n){
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
          /*    sau
          int = 2;
          while(i <= n){
            if (i%2==0) {
                System.out.println(i);
          }i+=2;
            */
    }
}
