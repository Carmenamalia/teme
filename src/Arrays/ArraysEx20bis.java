package Arrays;

public class ArraysEx20bis {
    public static void main(String[] args) {
        int[] list = {1, 7, 4, 3, 10, 9};
//        int max = 0;
//        int produs = 0;
//        int elem1 = 0;
//        int elem2 = 0;



        //inmultesc elem doua cate doua si aflu produsul max
//        for(int i = 0;i<list.length-1;i++){
//            for(int j = i+1;j< list.length;j++){
//                produs = list[i] * list[j];
//                if(produs>max){
//                    max = produs;
//                   elem1 = list[i];
//                   elem2 = list[j];
//                }
//            }
//        }

 //       System.out.println(elem1 + " * " + elem2);
        int[] pair =  findMaxProductPair(list);
        System.out.println(pair[0] + " " + pair[1]);

    }
    public static int[] findMaxProductPair(int[] list){
        int max = 0;
        int produs = 0;
        int[] pair = new int[2];
        for(int i = 0;i<list.length-1;i++){
            for(int j = i+1;j< list.length;j++){
                produs = list[i] * list[j];
                if(produs>max){
                    max = produs;
                   pair[0] = list[i];
                   pair[1] = list[j];
                }
            }
        }
        return pair;
    }
}
