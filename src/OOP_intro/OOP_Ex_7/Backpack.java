package OOP_intro.OOP_Ex_7;

public class Backpack {
    final int maxWeight;
    int currentWeight;
    Book[] bookList;// (un array de maxim 30 de carti)
    int numberOfBooks;
//Ghiozdanul are o anumita capacitate si tu trebuie sa pui niste carti in el.
    //Fiecare carte are titlu, numar de pagini si greutate. Poti sa pui carti in ghiozdan pana la o anumita greutate maxima
    // (daca la nu moment dat o carte depaseste greutate maxima, nu poti sa o mai pui in ghiozdan)

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;//pot sa nu pun ca parametru
        this.currentWeight = 0;//nu pun ca parametru ca nu stiu nr,initializez cu 0
        this.bookList = new Book[30];//nu pun ca param ,initializez cu max 30 carti
        this.numberOfBooks = 0;//nu pun ca param ca nu stiu cate carti vor fi adaugate
    }

    /* Clasa Backpack va avea urmatoarele functionalitati:

     ** getTotalPages() - va returna numarul total de pagini ale tuturor cartilor din ghiozdan
     ** getCurrentBooks() - va returna lista de carti care sunt in ghiozdan
     ** addBook() - va adauga o carte in ghiozdan, daca adaugarea ei nu depaseste greutatea maxima
     */
    public boolean addBook(Book book) {
        //verificam daca adaugarea cartii nu depaseste greutatea naxima
        if (currentWeight + book.weight > maxWeight) {
            return false;
        } else {
            bookList[numberOfBooks] = book;
            numberOfBooks++;
            //sau putem scrie bookList[numberOfBooks++] = book;
            currentWeight += book.weight;
            return true;
        }
    }

    public int getTotalPages() {
        //va returna numarul total de pagini ale tuturor cartilor din ghiozdan
        int sum = 0;
        for (int i = 0;i<numberOfBooks;i++){
            sum += bookList[i].numberOfPages;
        }
         return sum;
    }

//    public Book[] getCurrentBooks() {
//        Book[] addedBooks;
//        for (int i = 0; i < numberOfBooks; i++) {
//            addedBooks = new Book[]{bookList[i]};
//            return addedBooks;
//        }
        // sau:
        public void printCurrentBooks() {
            // va returna lista de carti care sunt in ghiozdan
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println(bookList[i].toString());
            }

        }
    }
