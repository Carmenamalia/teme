package SDA2.Election;

public class Main {
    public static void main(String[] args) {
        Election election = new Election(5);
        Candidat candidat1 = new Candidat("Alice");
        Candidat candidat2 = new Candidat("Bob");
        Candidat candidat3 = new Candidat("Charlie");
        election.addCandidat(candidat1);
        election.addCandidat(candidat2);
        election.addCandidat(candidat3);
Candidat[] candidats = {candidat1,candidat2,candidat3};
        election.vote("Alice");
        election.vote("Bob");
        election.vote("Alice");
        election.vote("Alice");
        election.vote("Charlie");
        election.vote("Bob");
        election.vote("Bob");
        election.vote("Alice");
        election.declareWinner();
    }
}