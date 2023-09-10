package SDA2.Election;

public class Candidat {
    private String name; //numele candidatului
    private int numberOfVotes; //Totalul voturilor primite de candidat



    public Candidat(String name) {
        this.name = name;
        this.numberOfVotes = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "name='" + name + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
