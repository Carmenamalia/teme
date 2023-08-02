package Arrays;

/* Scrie un program care sa afiseze cate numere pare si cate numere impare se afla intr-un array:
De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola Odd=4; Even=1
 */
public class ArraysEx11 {
    public static void main(String[] args) {
        int[] prices = {1, 7, 3, 10, 9};
        int counterEven = 0;
        int counterOdd = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]%2 == 0){
                counterEven++;
            }else{
                counterOdd++;
            }
        }
        System.out.println(counterEven);
        System.out.println(counterOdd);
    }
}
