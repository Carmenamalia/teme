package ArraysExercises;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arrays1 {
    public static void main(String[] args) {
        //CREATE ARRAYS:  the syntax: dataType[] arrayName; (ex: int[] data;)
        // to define nr of elements that an array can hold : allocate memory for the array: int[] data = new int[4];-> the array can store 4 elem of int type
        //once is declare the size end type cannot be changed

        int[] data = {12,19,2,8};//the size of array is 4; first elem is 12,second elem is 19,third elem is 2,etc

        //ACCES ARRAY ELEMENTS : we use INDEXes wich starts with 0
        //the index of first elem is 0; to acces its value we use data[0]
        //the index of the i th element is i-1 ; to acces its value we use data[i-1]

        //acces array elem:
        System.out.println("first elem: " + data[0]);
        System.out.println("second elem: " + data[1]);
        System.out.println("third elem: " + data[2]);

        //we can loop through elements of an array by using a "for loop"
        for(int i = 0; i < 4; ++i){
            System.out.println(data[i]);//i is used as an index

         //MODIFY ARRAY elements: by assigning a new value to it
         //changing third elem to 10:
         data[2] = 10;
         //changing fourth elem to 100:
            data[3] = 100;

         //SIZE of Array: we use the "lenght" property to get the size
         int size = data.length;
            System.out.println("size = " + size);
        }
    }
}