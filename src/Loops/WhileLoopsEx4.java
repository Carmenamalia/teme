import java.util.Scanner;

public class WhileLoopsEx4 {
    public static void main(String[] args) {
//Scrie un program care afiseaza suma numerelor divizibile cu 3 din intervalul [1-n], n fiind citit de la tastatura.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            if(i%3 == 0){
                sum = sum+1;
            }
            i++;//crescator   i-- e descrescator
        }
        System.out.println(sum);
    }
}
