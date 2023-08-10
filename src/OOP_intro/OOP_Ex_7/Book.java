package OOP_intro.OOP_Ex_7;

public class Book {
    String title;
    int numberOfPages;
    int weight;
    //Fiecare carte are titlu, numar de pagini si greutate.
    public Book(String title, int numberOfPages, int weight) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", weight=" + weight +
                '}';
    }
}
